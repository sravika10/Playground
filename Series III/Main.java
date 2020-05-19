#include<iostream>
using namespace std;
int main()
{
int i,n,a=5,c,b=6;
  cin>>n;
  for(i=0;i<n;i++)
  {
  if(i==0)
  {
  cout<<b;
    continue;
  }
    else
    {
    b=b+5*i;
      c=b;
      cout<<" "<<c;
    }
  }
return 0;
}