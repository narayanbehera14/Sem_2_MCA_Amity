#include<iostream>
#include<cstring>
using namespace std;

class Student{
    private:
    int roll;
    char name[30];
    int marks1,marks2;

    public:
    Student();
    Student(int , int );
    ~Student();
    int add(int ,int);
    int add();

};

Student::Student(){
    roll = 1 ;
    strcpy(name,"amity_student");
    cout <<"constructor invoked"<<endl;
    cout << "name =" <<name << endl;

}

Student::Student(int x, int y) {
    marks1 = x;
    marks2 = y;
}

Student::~Student(){
    cout << "\nDestructor invoked" <<endl;

}
int Student::add(){
    return marks1 + marks2;

}

int Student::add(int a, int b) {
    marks1 = a;
    marks2 = b;
    return marks1 + marks2;
}

int main() {
    Student s1;
    Student s2(10,20);

    cout <<"sum =" <<s2.add() <<endl;
    return 0;
}