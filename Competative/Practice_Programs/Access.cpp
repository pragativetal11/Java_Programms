#include <iostream>
using namespace std;

class Demo
{
    public:
        int i;
    private:
        int j;
    protected:
        int k;
    
    public:
        Demo()
        {
            i = 0;
            j = 0;
            k = 0;
        }

    void Display()
    {
        cout<<"valur i: "<<i<<"\n";
        cout<<"valur j: "<<j<<"\n";
        cout<<"valur k: "<<k<<"\n";
    }
};

int main()
{
    Demo dobj;

    dobj.Display();

    cout<<"valur i: "<<dobj.i<<"\n";
    cout<<"valur j: "<<dobj.j<<"\n";
    cout<<"valur k: "<<dobj.k<<"\n";

    return 0;
}