#include<iostream>
using namespace std;
int main()
{
  int n,r1,sum,i,a[10];
  std::cin>>n;
  i=0;
  while(n!=0)
  {
   r1=n%10;
    a[i]=r1;
    i++;
    n=n/10;
  }
    sum=a[0]+a[3];
  std::cout<<sum;
}