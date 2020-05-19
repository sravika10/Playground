#include <iostream>
#include <cstring>
#include<algorithm>

using namespace std;
struct Student
{
  string name;
  string department;
  int yearOfStudy;
  float cgpa;
};

bool compareName(Student s1, Student s2) {
   if(s1.name < s2.name) {
      return true;
   } return false;
}
int main()
{
  int num,studentNum;
  cout<<"Enter the number of students \n";
  cin>>num;
  Student s[num];
 
  for(int i=0;i<num;i++){
  cout<<"Enter the details of student "<< i+1 <<endl;
  //cin>>i;
  cout<<"Enter name "<<endl;
  cin>>s[i].name;
  cout<<"Enter department "<<endl;
  cin>>s[i].department;
  cout<<"Enter year of study "<<endl;
  cin>>s[i].yearOfStudy;
  cout<<"Enter cgpa "<<endl;
  cin>>s[i].cgpa;
  }
 
  sort(s, s+num,compareName);
 
  cout<<"Details of students \n";
  for(int i=0; i<num;i++)
  {
  cout<<"Student "<<i+1<<"\n";
  cout<<"Name:"<< s[i].name<<endl;
  cout<<"Department:"<< s[i].department<<endl;
  cout<<"Year of study:"<<s[i].yearOfStudy<<endl;
  cout<<"CGPA:"<<s[i].cgpa<<"\n";
  } 
  return 0;
}