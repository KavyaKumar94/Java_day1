function interpolatedQuaternion = interpolateQuaternion(orginalTime, orginalQuaternion, newTime)

    % Linear interpolation, TODO: use slerp, https://en.wikipedia.org/wiki/Slerp
    interpolatedQuaternion = interp1(orginalTime, orginalQuaternion, newTime, 'linear', 'extrap');

    % Normalise quaternion
    numberOfRows = size(interpolatedQuaternion, 1);
    for rowIndex = 1:numberOfRows
        interpolatedQuaternion(rowIndex,:) = interpolatedQuaternion(rowIndex,:) * (1 / norm(interpolatedQuaternion(rowIndex,:)));
    end
end