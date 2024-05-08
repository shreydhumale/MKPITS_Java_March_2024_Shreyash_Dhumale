//10. Develop a program that categorizes a given angle as acute, right, obtuse, or straight based on its measure using if statements

#include <stdio.h>

int main() {
    float angle;

    printf("Enter the measure of the angle: ");
    scanf("%f", &angle);

    if (angle > 0 && angle < 90) {
        printf("The angle is acute.\n");
    } else if (angle == 90) {
        printf("The angle is right.\n");
    } else if (angle > 90 && angle < 180) {
        printf("The angle is obtuse.\n");
    } else if (angle == 180) {
        printf("The angle is straight.\n");
    } else {
        printf("Invalid angle measure. Angle measure should be between 0 and 180 degrees.\n");
    }

    return 0;
}
