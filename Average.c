#include <stdio.h>

/* * PROJECT NAME: Simple Grade Calculator
 * DESCRIPTION: A basic C program that calculates average scores.
 * This demonstrates loops, arrays, and arithmetic in C.
 */

int main() {
    int numGrades;
    float sum = 0.0, average;

    printf("--- 🎓 Simple Grade Calculator ---\n");
    printf("How many grades would you like to enter? ");
    scanf("%d", &numGrades);

    float grades[numGrades];

    for(int i = 0; i < numGrades; i++) {
        printf("Enter grade %d: ", i + 1);
        scanf("%f", &grades[i]);
        sum += grades[i];
    }

    average = sum / numGrades;

    printf("\n--- RESULTS ---");
    printf("\nTotal Sum: %.2f", sum);
    printf("\nAverage Grade: %.2f\n", average);

    if (average >= 50) {
        printf("Status: PASS\n");
    } else {
        printf("Status: FAIL\n");
    }

    return 0;
}
