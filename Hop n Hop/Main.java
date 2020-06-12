#include<iostream>
using namespace std;
int main()
{
  int a=3,b=4,x,y,c,d;
  std::cin>>x>>y;
  c=x-a;
  d=y-b;
  (c>d)?std::cout<<c:std::cout<<d;
}