#include<iostream>

#include<string>

using namespace std;

int main()

{

string inp;

getline(cin, inp);

size_t idx = inp.find("the");

while(idx != string::npos)
{

inp.erase(idx, 4);

idx = inp.find("the");

}

cout<<inp;

}

