#include<stdio.h>
int main()
{
  //Type your code here
  int a=1,b=2,c,n;
  scanf("%d",&n);
  for(int i=0;i<n-2;i++){
    c=a+b;
    a=b;
    b=c;
  }
  printf("%d",c);
}
