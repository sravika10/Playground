#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int n,i;
  float s,r=0.5;
  cin>>n; 
  for(i=0;i<n;i++)
  {
    if(i==0)
    {
    cout<<r<<" ";
      continue;
    }
    else
    {
    s=r+pow(3,i-1);
    r=s;
    cout<<s<<" ";
    }
  }
  return 0;
  }