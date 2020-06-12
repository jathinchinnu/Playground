#include<iostream>
using namespace std;
int main()
{
  int n,c,sum=0,temp;
  std::cin>>n;
  temp=n;
 while(n!=0) 
 {
  c=n%10;
  sum=sum+c;
  n=n/10;}
 (temp%sum==0)?std::cout<<"Harshad Number":std::cout<<"Not Harshad Number";
  
}