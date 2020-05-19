#include<iostream>
using namespace std;
int main()
{
int i,m,n,z;
cin>>n;
cout<<"0";
for(i=2;i<=n;i++)
{
m=i*i;
if(m%2==0)
{
z=m-2;
cout<<" "<<z;
}
else
{
z=m-1;
cout<<" "<<z;
}
}
}
