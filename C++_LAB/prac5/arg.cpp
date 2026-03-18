#include <iostream>
#include <cstdlib>
using namespace std;

int main(int argc, char* argv[]){
    cout << "hello world" << endl;
    cout << "\n the number of arguments are = " << argc << endl;
    int sum = 0;
    for(int i = 1; i < argc; i++)
    {
        cout << "\n the argument " << i << " is " << argv[i] << endl;
        sum = sum + atoi(argv[i]);
    }

    cout << "\n the sum of all numbers passed as arguments to main is " << sum << endl;
    return 0;
}