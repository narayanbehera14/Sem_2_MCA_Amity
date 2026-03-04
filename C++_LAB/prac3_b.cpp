#include <iostream>
using namespace std;

int main(){
    
    int x = 10;
    int &refx = x;

    cout << "The value in x = " << x << endl;
    cout << "The address of x = " << &x << endl;

    cout << "The value in refx = " << refx << endl;

    refx = 20;

    cout << "After changing refx:" << endl;
    cout << "The value in x = " << x << endl;

    int v;
    v = 50;

    int *ptr;
    ptr =&v;

    cout<<endl<<"The value in v = "<<v;
    cout<<endl<<"The address of v ="<<&v;
    cout<<endl<<"the address of v = "<<ptr;
    cout <<endl<<"the value in v "<<*ptr;


    return 0;
}

#include<iostream>
#include<conio.h>
void swap(int *m,int *n)
{
    cout<<"the value of m an n before swapping within function"<<endl;
    cout<<"m="<<*m<<endl<<"n="<<endl;

    int temp;
    temp=*m;
    *m=*n;
    *n=temp;
    cout<<"the value of m and n after swapping within function"<<endl;
    cout<<"m="<<*m<<endl<<"n="<<*n<<endl;
}

main(){
clrscr();
    int x,y;
    x=10;
    y= 20;
    if(x<y)
    {
        cout<<"the y is largest"<<y;

    }
    else{
        cout<<"the x is largest"<<x;
    }
    int m;
    cout<<"enter a number"<<endl;
    cin>>m;
    if(m%2==0)
    {
        cout<<endl<<"m is even"<<m;

    }
    else{
        cout<<endl<<"m is odd"<<m;
    }
}

