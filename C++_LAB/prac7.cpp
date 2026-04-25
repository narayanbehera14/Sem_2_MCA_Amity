#include<iostream>
#using namespace
privte:
int roll;
char name[10];
ofstream ofs;
public:
void read data()
{
    ofs.open("demo1.txt",ios::app);
    cout<<"enter the roll number"<<endl;
    cin>>roll;
    cout<<"enter srudent anme"<<endl;
    cin>>name;
    ofs<<roll;
    ofs<<name;
}