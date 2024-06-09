#include<iostream>
using namespace std;

void LinearSearch(int arr[],int size, int key)
{
    int z=0;
    for(int i=0;i<size;i++){
        if(arr[i]==key ){
            cout<<"found"<<i<<endl;
            z=1;
        }

    }
    if(z==0){
        cout<<"not found"<<endl;
    }
}
int main()
{
    int size;
    cout<<"Enter the size :"<<endl;
    cin>>size;
    int arr[size];
    cout<<"Enter the array elements :"<<endl;
    for(int i=0;i<size;i++){
        cin>>arr[i];

    }
    int key ;
    cout<<"Enter key"<<endl;
    cin>>key;
    LinearSearch(arr,size,key);

}