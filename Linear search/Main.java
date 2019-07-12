#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int num,index,flag=0;
  scanf("%d",&num);
  for(int i=0;i<n;i++){
    if(a[i]==num){
      index=i+1;
      flag=1;
    }
  }
  if(flag==0) printf("%d isn't present in the array.",num);
  else printf("%d",index);
  
  return 0;
}