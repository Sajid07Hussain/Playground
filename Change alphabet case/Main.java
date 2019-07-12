#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  if((int)c>=97)
  printf("%c",c-32);
  else printf("%c",c+32);
	return 0;
}