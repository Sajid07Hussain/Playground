#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int p=n;
  int c=1;
  while(n){
    n/=10;
    c*=10;
  }
  int ans=(p%10)+(p/(c/10));
  printf("%d",ans);
	return 0;
}