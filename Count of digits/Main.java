#include<iostream>
int main()
{
  int n,d=0,a;
  std::cin>>n;
    do
    { 
      d=d+1;
      a=n%10;
      n=n/10;
    }while(n>0);
  std::cout<<d;
}