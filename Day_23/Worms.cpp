#include <iostream>
using namespace std;
int main()
{
    int ar[1000005];
    cout<<"hello"<<endl;
    int count = 0,n,a,m,q,index=1;
    cin>> n;
    while(count < n){
        cin>> a;
        for (int i = 0; i < a; i++)
        {
            ar[index++] = count+1;
        }++count;
    }count = 0; cin>> m ;
    while(count < m){
        cin>>q;
        cout<<ar[q]<<endl;  ++count;
    }
    return 0;
}