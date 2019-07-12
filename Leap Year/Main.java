#include<stdio.h>
int main()
{
  //Type your code here
  long n;
  scanf("%ld",&n);
  if(n%400==0) printf("LEAP YEAR");
  else if(n%100==0) printf("NOT LEAP YEAR");
  else if(n%4==0) printf("LEAP YEAR");
  else printf("NOT LEAP YEAR");
  return 0;
}