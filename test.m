clc
clear
close all;

%% Import data

sessionData = importSession('My Session');

%% Resample data

[resampledSessionData, time] = resampleSession(sessionData, 0.01);

%%