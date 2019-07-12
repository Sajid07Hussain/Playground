#include<stdio.h>
int main()
{
  //Type your code here
  int n,a[32],i=0;
  scanf("%d",&n);
  while(n){
    a[i]=n%2;
    n/=2;
    i++;
  }
  for(int j=i-1;j>=0;j--){
    printf("%d",a[j]);}
  return 0;
}