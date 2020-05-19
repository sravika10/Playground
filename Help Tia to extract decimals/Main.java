#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
	std::cin>>fnum;
  int i,z=1;
  std::cout<<"Floating part is : ";
  for(i=0;fnum[i]!='\0';i++){
    if(z==0)
      std::cout<<fnum[i];
    if(fnum[i]=='.')
      z=0;
  }
  return 0;
}