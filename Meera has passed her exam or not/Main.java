#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n],i,k;
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>k;
  for(i=0;i<n;i++)
  {if(a[i]==k)
    {
    cout<<"She passed her exam";
    return 0;
    }}
cout<<"She failed";
  return 0;
}