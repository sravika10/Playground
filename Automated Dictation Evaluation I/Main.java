#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char c1[100],c2[100];
  cin>>c1>>c2;
  int r=strcmp(c1,c2);
  if(r==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}