#include<stdio.h>

int main()
{
  // Type your code here
  int a=0;
  int b=0;
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n-2;i++){
    if(i%2==1){
      a=a+2;
    }
    else if(i%2==0){
      b=b+1;
    }
  }
  if(n%2==0) printf("%d",b);
  else printf("%d",a);
  return 0;
}