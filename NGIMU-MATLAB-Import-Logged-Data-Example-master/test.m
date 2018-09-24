clc
clear
close all;

%% Import data

sessionData = importSession('My Session');

%% Resample data

[resampledSessionData, ~] = resampleSession(sessionData, 0.01);

%% Plot synchronised gyroscope data

deviceColours = hsv(resampledSessionData.numberOfDevices);
surf(peaks);
colormap(deviceColours);
shading interp;

for deviceIndex = 1:resampledSessionData.numberOfDevices
    
    deviceName = resampledSessionData.deviceNames{deviceIndex};
    deviceColour = deviceColours(deviceIndex, :);
    
    
end

%%
% Import data
samplePeriod = 1/256;

time = resampledSessionData.ngimuBlue0029d0b4.sensors.time;
gyrX = resampledSessionData.ngimuBlue0029d0b4.sensors.gyroscopeX;
gyrY = resampledSessionData.ngimuBlue0029d0b4.sensors.gyroscopeY;
gyrZ = resampledSessionData.ngimuBlue0029d0b4.sensors.gyroscopeZ;
accX = resampledSessionData.ngimuBlue0029d0b4.sensors.accelerometerX;
accY = resampledSessionData.ngimuBlue0029d0b4.sensors.accelerometerY;
accZ = resampledSessionData.ngimuBlue0029d0b4.sensors.accelerometerZ;

%%
% -------------------------------------------------------------------------
% Manually frame data

startTime = 6;
stopTime = 26;

indexSel = find(sign(time-startTime)+1, 1) : find(sign(time-stopTime)+1, 1);
time = time(indexSel);
gyrX = gyrX(indexSel, :);
gyrY = gyrY(indexSel, :);
gyrZ = gyrZ(indexSel, :);
accX = accX(indexSel, :);
accY = accY(indexSel, :);
accZ = accZ(indexSel, :);

%%
% -------------------------------------------------------------------------
% Detect stationary periods

% Compute accelerometer magnitude
acc_mag = sqrt(accX.*accX + accY.*accY + accZ.*accZ);

% HP filter accelerometer data
filtCutOff = 0.001;
[b, a] = butter(1, (2*filtCutOff)/(1/samplePeriod), 'high');
acc_magFilt = filtfilt(b, a, acc_mag);

% Compute absolute value
acc_magFilt = abs(acc_magFilt);

% LP filter accelerometer data
filtCutOff = 5;
[b, a] = butter(1, (2*filtCutOff)/(1/samplePeriod), 'low');
acc_magFilt = filtfilt(b, a, acc_magFilt);

% Threshold detection
stationary = acc_magFilt < 0.05;

% -------------------------------------------------------------------------
% Plot data raw sensor data and stationary periods

figure('Position', [9 39 900 600], 'NumberTitle', 'off', 'Name', 'Sensor Data');
ax(1) = subplot(2,1,1);
    hold on;
    plot(time, gyrX, 'r');
    plot(time, gyrY, 'g');
    plot(time, gyrZ, 'b');
    title('Gyroscope');
    xlabel('Time (s)');
    ylabel('Angular velocity (^\circ/s)');
    legend('X', 'Y', 'Z');
    hold off;
ax(2) = subplot(2,1,2);
    hold on;
    plot(time, accX, 'r');
    plot(time, accY, 'g');
    plot(time, accZ, 'b');
    plot(time, acc_magFilt, ':k');
    plot(time, stationary, 'k', 'LineWidth', 2);
    title('Accelerometer');
    xlabel('Time (s)');
    ylabel('Acceleration (g)');
    legend('X', 'Y', 'Z', 'Filtered', 'Stationary');
    hold off;
linkaxes(ax,'x');
