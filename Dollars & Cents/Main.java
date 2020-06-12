#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,doll,cent;
  std::cin>>a>>b>>c>>d;
  doll=a+c;
  cent=b+d;
  while(cent>100)
  { 
    cent=cent-100;
    doll=doll+1;
  }
  std::cout<<doll<<"\n"<<cent;
    
}