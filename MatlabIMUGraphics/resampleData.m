function [resampledData, time] = resampleData(currentData, newSamplePeriod)

    %Copy the original data
    resampledData = currentData;
    
    % Determine the end time
    endTime = -Inf;
    maxTime = currentData.time;
    
    if maxTime > endTime
        endTime = maxTime;
    end
    endTime = floor(endTime / newSamplePeriod) * newSamplePeriod;
    
    % Create resampled time vector
    time = [0:newSamplePeriod:endTime]';
    
    % Loop through each CSV Column
    for csvColumnIndex = 1 : length(currentData)
        
        
    end
    
    
    
    
    
    
    
    
    
    
    
    
    
    
end