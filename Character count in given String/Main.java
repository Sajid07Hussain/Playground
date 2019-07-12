#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char c[100];
  gets(c);
  int n=strlen(c);
  if(n>20){
    printf("Invalid Input");
    exit(0);
  }
  int a[100],k=0;
  for(int i=0;i<100;i++) a[i]=0;
    for(int j=0;j<n;j++){
    if(c[j]==c[j+1]) k++;
    else{ printf("%c%d",c[j],k+1);k=0;}
}
  return 0;
}