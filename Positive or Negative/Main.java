#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  (n>=0)?std::cout<<n<<" is a positive number.":std::cout<<n<<" is a negative number.";
}