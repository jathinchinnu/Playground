#include<iostream>
using namespace std;
int main()
{
  int a,b,c,s,i,t;
  std::cin>>a>>b>>c;
  if(a>b&&a>c)
  {
    if(b>c)
    { 
      s=b;
    }else
    {
      s=c;
    }
  }else if(b>a&&b>c)
  {
    if(a>c)
    {
      s=a;
    }
    else
    {
      s=c;
    }
  }else if(c>a&&c>b)
  {
    if(a>b)
    {
      s=a;
    }
    else
    {
      s=b;
    }
  }
  std::cout<<"The treasure is in box which has number "<<s<<"\n";
  if(a%a==0&&b%a==0&&c%a==0)
  {
    std::cout<<"The code to open the box is "<<a;
  }
  else if(a%b==0&&b%b==0&&c%b==0)
  {
    std::cout<<"The code to open the box is "<<b;
  }
  else if(a%c==0&&b%c==0&&c%c==0)
  {
    std::cout<<"The code to open the box is "<<c;
  }
  else
    std::cout<<"The code to open the box is 1";
    
    
    
    
}