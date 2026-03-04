#include <iostream>
using namespace std;

void swapNumbers(int m, int n){
    cout << "Before swapping inside function:\n";
    cout << "m = " << m << endl;
    cout << "n = " << n << endl;

    int temp = m;
    m = n;
    n = temp;

    cout << "After swapping inside function:\n";
    cout << "m = " << m << endl;
    cout << "n = " << n << endl;
}

int main(){
    int x = 10;
    int y = 20;

    cout << "Before swapping in main:\n";
    cout << "x = " << x << endl;
    cout << "y = " << y << endl;

    swapNumbers(x, y);

    cout << "After function call in main:\n";
    cout << "x = " << x << endl;
    cout << "y = " << y << endl;

    return 0;
}