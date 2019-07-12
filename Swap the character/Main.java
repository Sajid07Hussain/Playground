#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here 
  for(int i=0;i<3;i++){
  char c[100];
  scanf("%s",c);
  int n=strlen(c);
    if(i==0){
  for(int j=0;j<n;j++){
    if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'||c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U')c[j]='$';
  }
  printf("%s",c);
    }
    else if(i==1){
  for(int j=0;j<n;j++){
    if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'||c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U') continue;
    else c[j]='#';
  }
  printf("%s",c);
    }
    else{
  for(int j=0;j<n;j++){
    if((int)c[j]>=97&&(int) c[j]<123) c[j]-=32;
  }
  printf("%s",c);
    }
  }
    return 0;
  }