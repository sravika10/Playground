#include <iostream>
using namespace std;
int main()
{
  int num, sum, rem;
 cin>>num;
  while(num>= 10)
  {
    for (sum=0; num>0;num=num/10)
    {
      rem=num%10;
      sum=sum +rem;  
    }
    if(sum >= 10)
    {
      num = sum;
    }
    else
    {
      cout<<sum;
      return 0;
    }
  } 
}
