#include<cstdio>
#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int a,b,c;
  cin>>a>>b>>c;
  if(a>b && a>c){
    if(b>c) cout<<b;
    else cout<<c;
  }
  else if(b>a && b>c){
    if(c>a) cout<<c;
    else cout<<a;
  }
  else if(c>a && c>b){
    if(b>a) cout<<b;
    else cout<<a;
  }
  return 0;
}