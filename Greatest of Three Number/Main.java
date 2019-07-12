#include <cstdio>
#include<iostream>
using namespace std;
int main()
{ 
    // type your code here
  int a,b,c;
  scanf("%d,%d,%d", &a,&b,&c);
  if(a>b && a>c) cout<<a;
  else if(b>c&&b>a) cout<<b;
  else cout<<c;
  return 0;
  
}