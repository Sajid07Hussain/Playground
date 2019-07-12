#include<iostream>
#include<cstdio>
using namespace std;
int main(){
  float rad,cen_ang;
  cin>>rad>>cen_ang;
  printf("%.2f",6.28*rad*cen_ang/360);
  return 0;
}