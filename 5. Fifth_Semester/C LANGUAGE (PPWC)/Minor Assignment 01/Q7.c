/*
Ques 7: Write a program that predicts the score needed on a final exam to achieve a desired grade in a course.
The program should interact with the user as follows:
Enter desired grade> B
Enter minimum average required> 79.5
Enter current average in course> 74.6
Enter how much the final counts as a percentage of the course grade> 25
You need a score of 94.20 on the final to get a B.
*/


#include <stdio.h>

int main() {
    char desGrade;
    float minAvgReq, currAvg, finalWt, finalScoreNeed;
    
    printf("Enter desired grade :");
    scanf("%c", &desGrade);  
    printf("Enter minimum average required :");
    scanf("%f", &minAvgReq);
    printf("Enter current average in course :");
    scanf("%f", &currAvg);
    printf("Enter how much the final counts as a percentage of the course grade :");
    scanf("%f", &finalWt);

    finalScoreNeed = (minAvgReq - currAvg * (1 - finalWt / 100)) / (finalWt / 100);
    printf("You need a score of %.2f on the final to get a %c.\n", finalScoreNeed, desGrade);

    return 0;
}


/*
Output ->
Enter desired grade :B 
Enter minimum average required :79.5
Enter current average in course :74.6
Enter how much the final counts as a percentage of the course grade :30
You need a score of 90.93 on the final to get a B.
 */