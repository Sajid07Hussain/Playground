#include<stdio.h>
#include<string.h>
int main(){
  char s1[100],s2[100],s3[100];
  scanf("%s%s%s",s1,s2,s3);
  for(int i=0;i<strlen(s1);i++){
  if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u')
    s1[i]='$';
  }
  for(int i=0;i<strlen(s2);i++){
  if(s2[i]=='a'||s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u')
    continue;
  else 
    s2[i]='#';
  }
  for(int i=0;i<strlen(s3);i++){
    s3[i]-=32;
  }
  printf("%s%s%s",s1,s2,s3);
  

  return 0;
}