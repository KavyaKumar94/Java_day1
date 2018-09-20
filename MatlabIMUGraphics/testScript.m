clc
clear
close all;

%% Import data
% Quaternion :- Column W (B) - Real Magnitude/ Column X (C) Y (D) Z(E) - Imaginary /Direction
[TIMES,W,X,Y,Z] = importfile('quaternion.csv');
%quaternionData = importQuaternion('quaternion.csv');
sensorData = importSensors('sensors.csv');

%% Resample the data

samplePeriod = 0.01;
newTime = -Inf;

 % Create resampled time vector
newTime = floor(newTime / samplePeriod) * samplePeriod;
% Linear interpolation, TODO: use slerp, https://en.wikipedia.org/wiki/Slerp
%for i= 2: size(quaternionData)
%    interpolatedQuaternion(i-1) = interp1(orginalTime, quaternionData(:,i), newTime, 'linear', 'extrap');
%end

interpolatedQuaternion = interp1(TIMES, W, newTime, 'linear', 'extrap');
%%

