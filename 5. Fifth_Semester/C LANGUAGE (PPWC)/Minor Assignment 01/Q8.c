/*
Ques 8: Write a program that calculates the acceleration (m/s2) of a jet fighter launched from an aircraft-carrier
catapult, given the jet’s takeoff speed in km/hr and the distance (meters) over which the catapult accelerates
the jet from rest to takeoff. Assume constant acceleration. Also calculate the time (seconds) for
the fighter to be accelerated to takeoff speed. When you prompt the user, be sure to indicate the units
for each input. For one run, use a takeoff speed of 278 km/hr and a distance of 94 meters. Relevant
formulas (v = velocity, a = acceleration, t = time, and s = distance)
v = at
s = 1/2*at^2
*/

#include <stdio.h>
#include <math.h>

int main() {
    float takeoffSpeedKmHr, distanceMeters;

    printf("Enter the jet's takeoff speed (in km/hr): ");
    scanf("%f", &takeoffSpeedKmHr);

    printf("Enter the distance over which the jet is accelerated (in meters): ");
    scanf("%f", &distanceMeters);

    float takeoffSpeedMS = takeoffSpeedKmHr * 1000.0f / 3600.0f;
    float acceleration = (takeoffSpeedMS * takeoffSpeedMS) / (2 * distanceMeters);
    float time = takeoffSpeedMS / acceleration;

    printf("The acceleration of the jet is %.2f m/s^2.\n", acceleration);
    printf("The time required for the jet to reach takeoff speed is %.2f seconds.\n", time);

    return 0;
}

/*
Output ->
Enter the jet's takeoff speed (in km/hr): 278
Enter the distance over which the jet is accelerated (in meters): 94
The acceleration of the jet is 31.72 m/s^2.
The time required for the jet to reach takeoff speed is 2.43 seconds.
*/