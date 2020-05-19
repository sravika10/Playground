#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i=0;
cin.getline(str, 80);
  while(str[i]!='\0')
  {
    i++;
  }
  int l=i;
  for(i=0;i<l;i++)
    rev[i]=str[l-i-1];
  std::cout<<rev;
}