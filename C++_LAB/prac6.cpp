#include <iostream>
#include <conio.h>
#include <cstring>
using namespace std;


class Person
{
private:
	char name[10];
	int age;
public:

void setData()
{
	strcpy(name,"Pratik");
	age=19;
}
void printData()
{
	cout<<"the name="<<name<<endl;
	cout<<"Age=" <<age<<endl;
}

};

class Student:public Person
{
private:
char program[10];
int enrol;
public:
void setStudent()
{
strcpy(program,"bscit");
enrol=4;
}

void printStudent()
{
cout<<"the enrolment number"<<enrol<<endl;
cout<<"program"<<program<<endl;
}
};

int main()
{
Student obj;
obj.setData();
obj.setStudent();
obj.printData();
obj.printStudent();
return 0;
}