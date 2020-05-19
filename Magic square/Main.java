#include<iostream>
using namespace std;
int main()
{
  int a[100][100];
  int i,j,n=0,sum=0,sum1=0,sum2=0,sum3=0,flag=1;
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
      if(i==j)
        sum=sum+a[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      sum1=sum1+a[i][j];
      sum2=sum2+a[i][j];
      if(i+j+1==n)
        sum3=sum3+a[i][j];
    }
    if(sum!=sum1 || sum2!=sum)
    {
      flag=0;
      break;
    }
    sum1=0;
    sum2=0;
  }
  if(flag==1 && sum==sum3)
    cout<<"Yes";
  else
    cout<<"No";
}  