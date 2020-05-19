#include<iostream>
#include<math.h>
using namespace std;
int power(int,int);
int main()
{
  int a,n,r;
  cin>>a>>n;
  r=power(a,n);
  cout<<"Enter the value of a"<<endl;
  cout<<"Enter the value of n"<<endl;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<r;
  return 0;
}
int power(int a,int n)
{
if(n!=0)
{
  return(a*power(a,n-1));
}
  else
    return 1;
}