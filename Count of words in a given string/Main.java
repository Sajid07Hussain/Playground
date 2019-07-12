#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here
  char c[100];
  int p=0;
  gets(c);
  for(int i=0;i<strlen(c);i++){
    if(c[i]==' ') p++;
  }
  printf("%d",p+1);
  
}