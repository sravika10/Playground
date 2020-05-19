#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,a[100][100],max;
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
    max=a[i][0];
    for(j=1;j<n;j++)
    {
      if(a[i][j]>max)
        max=a[i][j];
    }
    cout<<max<<endl;
  }
}