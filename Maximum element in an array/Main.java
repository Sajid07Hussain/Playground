#include<bits/stdc++.h>
using namespace std;
int main()
{
  	//type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++) scanf("%d",&a[i]);
  printf("%d",*max_element(a,a+n));
  return 0;
}