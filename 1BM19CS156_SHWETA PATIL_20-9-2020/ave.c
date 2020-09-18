#include<stdio.h>
float sumaver(int,int);
void printeven(int,int);
int main()
{
    int a,b,c;
    float ave;
    printf("enter the 3 numbers\n");
    scanf("%d%d%d",&a,&b,&c);
    if(a<b)
    {
        if(a<c)
        {
            ave=sumaver(b,c);
            printf("average is %f\n",ave);
            printeven(b,c);
        }
        else
        {
        ave=sumaver(b,a);
        printf("average is %f\n",ave);
        printeven(b,a);
        }
        if(b<c)
        {
            ave=sumaver(a,c);
            printf("average is %f\n",ave);
            printeven(a,c);
        }
        else
        {
            ave=sumaver(b,a);
            printf("average is %f\n",ave);
            printeven(b,a);
        }
        return 0;
    }
    float sumaver(int n1,int n2);
    {
        printf("\n sum of greater two numbers is %d\n",n1,n2);
        return ((n1+n2)/2.0);
    }
    void printeven(int n1,int n2);
    {
        int initial,final,i,flag=0;
        if(n1<n2)
        {
            initial=n1;
            final =n2;
        }
        else
        {
            initial=n2;
            final=n1;
        }
        for(i=initial+1;i<final;i++)
        {
            flag=1;
            if(i%2==0)
            printf("\n%d",i);
        }
        if(flag==1)
        printf("\n is the number between %d&%d",initial,final);
        else
        printf("\n no even numbers between %d&%d",initial,final);
        return 0;
    }
}    