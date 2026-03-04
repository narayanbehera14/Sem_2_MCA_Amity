#include<iostream>
#include <vector>
using namespace std;


int main(){

    cout << "This is C++ programming language." << endl;

    vector<string> cars = {"a", "b", "c"};

    for (int i = 0; i < cars.size(); i++){
        cout << cars[i] << endl;
    }

    

    return 0;
}