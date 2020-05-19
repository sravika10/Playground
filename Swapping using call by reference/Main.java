#include<iostream>
using namespace std;
void swap(int &x,int &y)
{
  x+=y-(y=x);
}
int main()
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
  swap(x,y);
  cout<<"After swapping a= "<<x<<" and b="<<y;
  return 0;
}