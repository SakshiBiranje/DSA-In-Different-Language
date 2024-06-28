public class MergeSort {
    
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
    }
    
    private static void mergeSort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, helper, low, middle); // Sort left half
            mergeSort(array, helper, middle + 1, high); // Sort right half
            merge(array, helper, low, middle, high); // Merge them
        }
    }
    
    private static void merge(int[] array, int[] helper, int low, int middle, int high) {
        // Copy both halves into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }
        
        int i = low; // Initial index for the left subarray
        int j = middle + 1; // Initial index for the right subarray
        int k = low; // Initial index for the merged subarray
        
        // Compare elements from both halves and merge them
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        
        // Copy the rest of the left half
        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
        
        // No need to copy the rest of the right half because it's already in place
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array:");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}