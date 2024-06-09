#include<iostream>
using namespace std;
int BinarySearch(int arr[],int size,int key)
{
	int s=0;
	int e=size;
        while(s<=e){
	int mid =(s+e)/2;

	if(arr[mid]==key){
	return mid;
	}
else if(arr[mid]>key){
    e=mid-1;
}
else if(arr[mid]<key){
    e=mid+1;
}
        }
return -1;

}


int main(){

int size;
cout<<"Enter size:"<<endl;
cin>>size;
int arr[size];
cout<<"Enter elements:"<<endl;
for(int i=0;i<size;i++)
{
cin>>arr[i];
}
int key;
cout<<"Enter key:"<<endl;
cin>>key;
cout<<BinarySearch(arr,size,key)<<endl;
}