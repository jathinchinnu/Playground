#include <iostream>
int main() 
{
 int n,a=0,c;
  std::cin>>n;
  while(n!=0)
  {
   c=n%10;
    a=a*10+c;
    n=n/10;
  }
  std::cout<<a;
	return 0;
}