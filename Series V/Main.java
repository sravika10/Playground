#include<iostream>
using namespace std;
int main()
{

int i,n,m=11,z;
cin>>n;
cout<<m*m;
for(i=2;i<=n;i++)
{
m=m+4;
z=m*m;
cout<<" "<<z;
}
}