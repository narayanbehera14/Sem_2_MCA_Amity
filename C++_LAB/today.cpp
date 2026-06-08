#include <fstream.h>
#include <iostream.h>
#include <conio.h>

void main()
{
    clrscr();

    fstream fs1("even.txt", ios::out);
    fstream fs2("odd.txt", ios::out);

    for(int num = 0; num <= 10; num++)
    {
        if(num % 2 == 0)
        {
            fs1 << num << " ";
        }
        else
        {
            fs2 << num << " ";
        }
    }

    cout << "Numbers are written to files successfully!" << endl;

    fs1.close();
    fs2.close();

    getch();
}