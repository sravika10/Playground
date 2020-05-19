#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  int l;
 std::string str;
  getline(cin, str);
  l=str.length();
  for(int i=0;i<l;i++)
  {
    cout<<str[l-i-1];
  }
  return 0;
}