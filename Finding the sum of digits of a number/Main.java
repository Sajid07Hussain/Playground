#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int c=0;
  while(n){
    c+=n%10;
    n/=10;
  }
  printf("%d",c);
  
	return 0;
}