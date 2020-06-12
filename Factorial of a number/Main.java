#include<iostream>
int main(){
  int i,n,f=1;
  std::cin>>n;
  for(i=n;i>0;i--)
    f=f*i;
  std::cout<<f;
}