#include<stdio.h>
#include<string.h>
#include<math.h>
int main()
{
  //Type your code here
  char a[100];
  int num=0;
  scanf("%s",a);
  int n=strlen(a);
  for(int i=n-1;i>=0;i--){
    if((int)a[i]==49)
    num+=(a[i]-48)*pow(2,n-1-i);
  }
  printf("%d",num);
    
  return 0;
}