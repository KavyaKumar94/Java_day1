function sessionData = importSession1(sessionDirectory, varargin)

% Set optional argument default values
    fileNames = {};

    % Get optional arguments
    for index = 1:2:(nargin - 1)
        if strcmp(varargin{index}, 'FileNames')
            fileNames = varargin{index + 1};
            continue;
        end
        error('Unexpected argument.');
    end

    % List directories and files in session directory
    directoryList = dir(sessionDirectory);

    % Error if session directory does not exist
    if isempty(directoryList)
        error('Session directory is empty or does not exist.');
    end

    % Error if Session.xml not present
    invalid = true;
    for directoryIndex = 1:length(directoryList)
        if strcmp('Session.xml', directoryList(directoryIndex).name)
            invalid = false;
        end
    end
    if invalid
        warning('Session.xml not found. This may be because the specified directory is not a session directory, or because the logging has not yet completed.');
    end

     % Loop through each device directory
    for directoryIndex = 1:length(directoryList)

        % Skip the first 2 results which are always '.' and '..'
        if directoryIndex < 3
            continue;
        end

        % Skip if not directory
        if ~directoryList(directoryIndex).isdir
            continue;
        end
    
        % List files in device directory
        directoryPath = [sessionDirectory filesep directoryList(directoryIndex).name filesep];
        fileList = dir(directoryPath);
        
        
         % Add each CSV file to data structure
        deviceName = formatFieldName(directoryList(directoryIndex).name, false);

        
         for fileIndex = 1:length(fileList)
            filePath = [directoryPath fileList(fileIndex).name];

            % Skip if not CSV file
            [~, name, extension] = fileparts(filePath);
            if ~strcmp('.csv', extension)
                continue;
            end

            % Skip if not in specified list of file names
            if ~isempty(fileNames)
                if strcmp(name, fileNames) == 0
                    continue;
                end
            end
            
            % Read CSV headings
            fileID = fopen(filePath);
            csvHeadings = strsplit(fgets(fileID), ',');
            fclose(fileID);

            % Read CSV file
            fileName = formatFieldName(name, false);
            %csvData = textscan(fileName,'Delimiter',',','EndOfLine','\r\n','ReturnOnError',false);
            
    
            csvData = dlmread(filePath, ',', 1, 0);

            % Remove repeated samples
            csvData = unique(csvData, 'rows');

            % Add each column to data structure
            for headingIndex = 1:length(csvHeadings)
                heading = formatFieldName(csvHeadings{headingIndex}, true);
                sessionData.(deviceName).(fileName).(heading) = csvData(:,headingIndex);
            end
         end
    end
    
    
end