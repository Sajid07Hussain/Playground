#include<stdio.h>
int check_prime(int n){
  int c=0;
  for(int i=2;i<n;i++){
    if(n%i==0) c++;
  }
  if(c==0) return 1;
  else return 0;
}
int main()
{
  //Type youe code here
  int n,sum=0;
  scanf("%d",&n);
  int a=2;
  while(1){
    if(check_prime(a)==1){ sum+=a;}
      a++;
    if(a>n) break;
  }
  printf("%d",sum);
  return 0;
}