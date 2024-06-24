#include <iostream>
using namespace std;
int main(){
    int exam;
    string grade;
    cin >> exam;
    if(90 <= exam && exam <= 100) cout << "A";
    else if(80 <= exam && exam <= 89) cout << "B";
    else if(70 <= exam && exam <= 79) cout << "C";
    else if(60 <= exam && exam <= 69) cout << "D";
    else cout << "F";
}