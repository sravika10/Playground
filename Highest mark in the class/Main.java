#include<iostream>
using namespace std;
int main()
{
  int n,i,max=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++){
    cin>>a[i];
    if(a[i]>max)
      max=a[i];}
  cout<<max;
  return 0;
}