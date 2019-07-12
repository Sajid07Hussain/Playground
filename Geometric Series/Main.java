#include<stdio.h>
int main()
{
  //type your code here
  int n;
  scanf("%d",&n);
  int a[100];
  a[0]=1;
  a[1]=1;
  for(int i=2;i<100;i++){
    if(i%2==0) a[i]=a[i-2]*2;
    else a[i]=a[i-2]*3;
  }
  printf("%d",a[n-1]);
  return 0;
}