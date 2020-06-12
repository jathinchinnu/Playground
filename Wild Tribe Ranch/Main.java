#include<iostream>
int main()
{
  int m,w;
  std::cin>>m>>w;
  if(m==w)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else if(m>w)
    std::cout<<"Yes, you can enter.";
  else 
    std::cout<<"Sorry, you can't enter";
}