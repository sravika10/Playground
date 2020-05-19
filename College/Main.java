#include<iostream>
#include<string.h>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage; 
}s1[10],temp;
int main()
{
  int i,j,n,k;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  k=1;
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<k<<endl;
      cout<<"Enter name"<<endl;
    cin>>s1[i].name;
       cout<<"Enter city"<<endl;
    cin>>s1[i].city;
       cout<<"Enter year of establishment"<<endl;
    cin>>s1[i].establishmentYear;
       cout<<"Enter pass percentage"<<endl;
    cin>>s1[i].passPercentage;
    k++;
}
  for (i = 1; i < n; i++)
      for (j = 0; j < n - i; j++) {
         if (strcmp(s1[j].name, s1[j + 1].name) > 0) {
            temp = s1[j];
            s1[j] = s1[j + 1];
            s1[j + 1] = temp;
         }
      }
  k=1;
     cout<<"Details of colleges"<<endl;
  for(i=0;i<n;i++)
  {
    cout<<"College:"<<k<<endl;
    cout<<"Name:"<<s1[i].name<<endl;
    cout<<"City:"<<s1[i].city <<endl;
    cout<<"Year of establishment:"<<s1[i].establishmentYear<<endl;
    cout<<"Pass percentage:"<<s1[i].passPercentage<<endl;
    k++;
  }
  return 0;
}