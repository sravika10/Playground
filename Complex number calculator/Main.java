#include <iostream>
using namespace std;
struct student
{
    int x;
  int y;
}a,b,c;
int main() 
{
  int s;
  cin>>s;
  cin>>a.x>>a.y>>b.x>>b.y;
  switch(s)
  {
    case 1:c.x=a.x+b.x;
      c.y=a.y+b.y;
break;
    case 2:c.x=a.x-b.x;
      c.y=a.y-b.y;
      break;
    case 3:
      c.x = a.x * b.x - a.y * b.y;
   c.y =a.x * b.y + b.x * a.y;
      break;
    default:cout<<"Invalid choice";return 0;
  }
  cout<<c.x;
  if(c.y>=0)
    cout<<"+"<<c.y<<"i";
  else
    cout<<c.y<<"i";
 return 0;
}