#include<stdio.h>
int main()
{
	//type your code here
  int n;
  scanf("%d",&n);
  int a[200];
  a[0]=0;
  a[1]=0;
  for(int i=2;i<200;i++){
    if(i%2==0) a[i]=a[i-2]+2;
    else a[i]=a[i-2]+1;
  }
  printf("%d",a[n-1]);
    
	
}