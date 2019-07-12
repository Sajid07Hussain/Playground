#include<stdio.h>
int main()
{
  //Type your code here
  int n,c=0;
  scanf("%d",&n);
  while(n!=0){
    c+=n%10;
    n/=10;
  }
  printf("%d",c);
  return 0;
}