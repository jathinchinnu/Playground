#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d;
  float overs,covers,crr,trr;
  std::cin>>a>>b>>c>>d;
  overs=(a/6)+(a%6*(0.1));
  covers=d/6+(d%6*(0.1));
  crr=c/covers;
  trr=b/overs;
  std::cout<<overs<<"\n"<<covers<<"\n";
  std::cout<<fixed<<setprecision(1)<<crr<<"\n";
  std::cout<<fixed<<setprecision(1)<<trr<<"\n";
  if(trr>crr)
    std::cout<<"Not Eligible to Win";
  else
    std::cout<<"Eligible to Win";
}