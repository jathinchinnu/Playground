#include<iostream>
using namespace std;
int main()
{
  int n;
  std::string str=" a leap year";
  std::cin>>n;
  if(n%4==0&&n%100!=0||n%400==0)
    std::cout<<n<<" is"<<str;
  else 
    std::cout<<n<<" is not"<<str;
}