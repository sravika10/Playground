#include<iostream>
using namespace std;
int main()
{
    int i,j,m,n;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  for(i=0;i<n;i++){
    for(j=0;j<m;j++){
      cout<<a[j][i]<<" ";}cout<<"\n";}
  return 0;
}