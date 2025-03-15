#include <stdio.h>

int main()
{
    int maths,science,english,total;
    float percent;
    
    printf(" maths marks = ");
    scanf("%d",&maths);
    
    printf("\n science marks = ");
    scanf("%d",&science);
    
    printf("\n english marks = ");
    scanf("%d",&english);
    
    total = maths+science+english;
    percent=total/3;
    
    printf("\n percentage marks obtained = %f",percent);
    return 0;
}
