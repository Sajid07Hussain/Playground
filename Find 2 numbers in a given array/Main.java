#include<stdio.h>
int main()
{
  	//type your code here
   int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  for(int j=0;j<2;j++){
  int p,index1,c1=0;
  scanf("%d",&p);
  for(int i=0;i<n;i++){
    if(a[i]==p){
      index1=i;
      c1++;
    }
  }
  if(c1==0) printf("Element %d index = %d\n",j+1,-1);
  else
  printf("Element %d index = %d\n",j+1,index1);
  }
}