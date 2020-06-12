#include<iostream>
using namespace std;
int main()
{
  int u,a;
  std::cin>>u;
  
  if(u<=200)
  {
    a=u*0.5;
    std::cout<<"Rs."<<a;
  } else if(u<=400)
    std::cout<<"Rs."<<(u*0.65+100);
  else if(u<=600)
    std::cout<<"Rs."<<(u*0.80+200);
  else 
    std::cout<<"Rs."<<(u*1.25+425);
}