#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int f=num/100;
  int t=num%10;
  printf("%d",f+t);
  return 0;
}