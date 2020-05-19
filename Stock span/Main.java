#include<iostream>
using namespace std;
void stockSpan(int n,int* a){
  int sum=0;
  cout<<"1"<<"\n";
  for(int i=1;i<n;i++){
    if(a[i]<a[i-1])
      cout<<"1";
    else{
      sum=sum+2;
      cout<<sum;
    }
    if(i!=n-1)
      cout<<"\n";
  }
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  stockSpan(n,a);
}