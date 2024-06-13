#include<iostream>
using namespace std;

void swap(int array[],int i,int j)
{
  int temp = array[i];
  array[i] = array[j];
  array[j] = temp;
}

int partition(int array[],int start,int end)
{
    int pivot =array[end];
    int  i = start -1;
    for(int j = start ; j < end ; j++)
    {
        if(array[j]<pivot)
        {
            i++;
           swap(array,i,j);
        }
    }
       swap(array,i+1,end);
       return i+1;
}

int QuickSort(int array[],int start , int end)
{
    if(start<end)
    {
      int pivot = partition(array,start,end);
      QuickSort(array, start,pivot-1);
      QuickSort(array,pivot+1,end);
     }
     return 0;
}

int main()
{
    int size;
    cout<<"Enter the size of the element  : ";
    cin>>size;
    int array[size];
    cout<<"Enter the element in array : ";
    for(int i = 0 ; i < size ; i++)
    {
        cin>>array[i];
    }
    int start = 0;
    int end = size-1;
    QuickSort(array,start,end);
    cout<<"Sorted array : ";
    for(int i = 0 ; i < size ; i++)
    {
        cout<<array[i]<<" ";
    }
    return 0;
}