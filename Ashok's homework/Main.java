#include<iostream>
using namespace std;
int main()
{
    int i,j,m,n;
  cin>>m>>n;
  int a[m][n],b[m][n];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
   for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      cin>>b[i][j];
   for(i=0;i<m;i++){
    for(j=0;j<n;j++){
      cout<<a[i][j]+b[i][j]<<" ";}cout<<"\n";}
  return 0;
}