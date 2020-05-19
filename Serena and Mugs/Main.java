#include<iostream>
using namespace std;
int main()
{
    int n,v,s=0,i;
    int a[20];
    cin>>n>>v;
    for(i=0;i<n;i++)
     cin>>a[i];
     for(i=0;i<n;i++)
      s=s+a[i];
     if(s<=v)
      cout<<"YES";
     else
     cout<<"NO";
}