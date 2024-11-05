import java.util.*;

public class QuickSort 
{
    public static int partition(int array[], int low, int high) 
{
        int pivot = array[high];
        int i = low-1;
    
        for(int j=low; j<high; j++)
{
            if(array[j] < pivot)
{
                i++;
                //swapping
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;
    }

    public static void quickSort(int array[], int low, int high)
    {
        if(low < high)
        {
            int pivotidx = partition(array, low, high);

            quickSort(array, low, pivotidx-1);
            quickSort(array, pivotidx+1, high);
        }
    }
    public static void main(String args[])
    {
        int[] array = {6,3,9,5,2,8};
        int n = array.length;

        quickSort(array, 0, n-1);

        for (int i = 0; i < n; i++) 
        {
            System.out.print(array[i] + " ");
        } 
        System.out.println();       
    }
}

