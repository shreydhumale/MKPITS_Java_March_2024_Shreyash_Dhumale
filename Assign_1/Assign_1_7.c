//6. Write a program that categorizes a given person's BMI (Body Mass Index) into different weight categories (underweight, normal weight, overweight, obese) using if statements.

#include <stdio.h>

int main() {
    float weight, height, bmi;

    // Input weight in kilograms and height in meters
    printf("Enter weight in kilograms: ");
    scanf("%f", &weight);
    printf("Enter height in meters: ");
    scanf("%f", &height);

    // Calculate BMI
    bmi = weight / (height * height);

    // Categorize BMI
    if (bmi < 18.5) {
        printf("BMI = %.2f\n", bmi);
        printf("Underweight\n");
    } else if (bmi >= 18.5 && bmi < 25.0) {
        printf("BMI = %.2f\n", bmi);
        printf("Normal weight\n");
    } else if (bmi >= 25.0 && bmi < 30.0) {
        printf("BMI = %.2f\n", bmi);
        printf("Overweight\n");
    } else {
        printf("BMI = %.2f\n", bmi);
        printf("Obese\n");
    }

    return 0;
}

