#include<stdio.h>
int main()
{
  //type your code here
  int n,i=0;
  int a[32];
  scanf("%d",&n);
  while(n){
    a[i]=n%8;
    n/=8;
    i++;
  }
  for(int j=i-1;j>=0;j--) printf("%d",a[j]);
  return 0;
}