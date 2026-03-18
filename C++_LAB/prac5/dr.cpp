#include <iostream>
#include <cstdlib>

using namespace std;

int main(int argc, char* argv[]) {
    if (argc < 2) {
        cout << "Usage: " << argv[0] << " <option>\n";
        cout << "Options:\n";
        cout << "  f   list all files\n";
        cout << "  c   list .cpp files\n";
        cout << "  h   show this help\n";
        return 1;
    }

    char ch = argv[1][0];

    cout << "argv[1] = " << argv[1] << endl;
    cout << "character = " << ch << endl;

    switch (ch) {
    case 'f':
        system("dir");
        break;
    case 'c':
        system("dir *.cpp");
        break;
    case 'h':
        cout << "\nUse for listing files" << endl;
        cout << "For example: " << argv[0] << " f" << endl;
        break;
    default:
        cout << "Unknown option: " << ch << endl;
        break;
    }

    return 0;
}

