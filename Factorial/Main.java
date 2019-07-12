#include<cstdio>
#include<iostream>
using namespace std;

int main()
{
	long int n,fact=1;
  	cin>>n;
  if(n==0) cout<<1;
  else{
  	while(n>=1){
      fact*=n;
      n--;
    }
  cout<<fact;
  }
}