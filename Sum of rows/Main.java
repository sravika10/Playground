#include<iostream>
using namespace std;
int main()
{
int i,j,a[100][100],m,n,sum=0;
  cin>>m>>n;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<m;i++)
  {
    sum=0;
    for(j=0;j<n;j++)
    {
     sum=sum+a[i][j];
    }
    cout<<sum<<endl;
}
}