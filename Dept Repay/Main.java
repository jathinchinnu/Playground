#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  float inter,amount,disc,finall;
  std::cin>>x>>y>>z;
  inter=(x*y*z)/100;
  amount=x+inter;
  disc=inter*2/100;
  finall=amount-disc;
  std::cout<<inter<<"\n"<<amount<<"\n"<<disc<<"\n"<<finall;
}