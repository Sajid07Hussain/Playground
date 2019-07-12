#include <stdio.h>
int main() {
	//Type your code
  int n,c=1;
  scanf("%d",&n);
  int p=n;
  while(n){
    n/=10;
    c*=10;
  }
  c/=100;
  int num=p/c;
  printf("%d",num%10);
	return 0;
}