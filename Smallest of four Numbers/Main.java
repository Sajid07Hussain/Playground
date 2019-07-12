#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  // Type your code here
  int n=4;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  sort(a,a+n);
  cout<<a[0];
}