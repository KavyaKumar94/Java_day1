function fieldName = formatFieldName(string, isCsvColumnHeading)

    % Remove trailing parentheses if string is CSV column heading
    if isCsvColumnHeading
        splitOriginalText = strsplit(string, '(');
        string = splitOriginalText{1};
    end

    % Remove non-alphanumeric characters
    string(~ismember(string, ['0':'9', 'A':'Z', 'a':'z'])) = ' ';

    % Create lower camel case string
    words = lower(strsplit(string, ' '));
    fieldName = words{1};
    for wordIndex = 2:length(words)
        if isempty(words{wordIndex})
            continue;
        end
        words{wordIndex}(1) = upper(words{wordIndex}(1));
        fieldName = [fieldName words{wordIndex}];
    end
end
