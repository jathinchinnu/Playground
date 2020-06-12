#include<iostream>
using namespace std;
int main()
{
 int Fa,Fd,Fs,Sa,Sd,Ss,Aa,Ad,As,F,S,A;
  std::cin>>Fa>>Fd>>Fs>>Sa>>Sd>>Ss>>Aa>>Ad>>As;
  F=(Fa-((Fa/100)*Fd)+Fs);
  S=(Sa-((Sa/100)*Sd)+Ss);
  A=(Aa-((Aa/100)*Ad)+As);
  std::cout<<"In Flipkart Rs."<<F<<"\n";
  std::cout<<"In Snapdeal Rs."<<S<<"\n";
  std::cout<<"In Amazon Rs."<<A<<"\n";
  if(F<=S&&F<A)
    std::cout<<"He will prefer Flipkart";
    else if(S<A)
      std::cout<<"He will prefer Snapdeal";
  else 
    std::cout<<"He will prefer Amazon";
  
}