#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int a,b;
  cin>>a>>b;
  int max=a>b?a:b;
  do
    {
        if (max % a == 0 && max % b == 0)
        {
            cout<< max;
            break;
        }
        else
            ++max;
    } while (true);
  return 0;
}