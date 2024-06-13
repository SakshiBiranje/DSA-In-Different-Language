#include <iostream>
using namespace std;

void Merge(int arr[], int start, int mid, int end) 
    {
        
    int size1 = mid - start + 1;
    int size2 = end - mid;

    int a[size1];
    int b[size2];

    for (int i = 0; i < size1; i++) {
        a[i] = arr[start + i];
    }
    for (int i = 0; i < size2; i++) {
        b[i] = arr[mid + 1 + i];
    }

    int i = 0;
    int j = 0;
    int k = start;
    while (i < size1 && j < size2) {
        if (a[i] <= b[j]) {
            arr[k] = a[i];
            k++;
            i++;
        } 
        else {
            arr[k] = b[j];
            k++;
            j++;
            
        }
    }

    while (i < size1) {
        arr[k] = a[i];
        i++;
        k++;
    }

    while (j < size2) {
        arr[k] = b[j];
        j++;
        k++;
    }
}

void MergeSort(int arr[], int start, int end) {
    if (start < end) {
        int mid = (start + end ) / 2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid + 1, end);
        Merge(arr, start, mid, end);
    }
}

int main() {
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    //int* array = new int[size];
    int arr[size];
    cout << "Enter the elements in the array: ";
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }
    MergeSort(arr, 0, size - 1);
    cout << "Sorted array: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}