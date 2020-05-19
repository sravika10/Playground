#include<iostream>
#include<string.h>
using namespace std;
struct employee
{
  char name[30];
  int id;
  int age;
  char deg[30];
  int sal;
};
int main()
{
  struct employee emp;
  cin>>emp.name;
  cin>>emp.id;
  cin>>emp.age;
  cin>>emp.deg;
  cin>>emp.sal;
  cout<<"Enter name:"<<endl;
  cout<<"Enter ID:"<<endl;
  cout<<"Enter age:"<<endl;
  cout<<"Enter designation:"<<endl;
  cout<<"Enter Salary:"<<endl;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<emp.name<<endl;
  cout<<"ID of the Employee : "<<emp.id<<endl;
  cout<<"Age of the Employee : "<<emp.age<<endl;
  cout<<"Designation of the Employee : "<<emp.deg<<endl;
  cout<<"Salary of the Employee : "<<emp.sal;
}