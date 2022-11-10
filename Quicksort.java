import java.util.*;

public class Quicksort {
     /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    static int partition(int array[], int left, int right) {
        int pivot = array[right];
        int xPtr = (left - 1);
        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) {
                xPtr++;
                swap(array, xPtr, i);
            }
        }
        swap(array, xPtr + 1, right);
        return (xPtr + 1);
    }
    
    static void swap(int array[], int n1, int n2) {
        int temp = array[n1];
        array[n1] = array[n2];
        array[n2] = temp;
    }

    static void quickSort(int array[], int left, int right) {
        if (left < right) {
            int pi = partition(array, left, right);
            quickSort(array, left, pi - 1);
            quickSort(array, pi + 1, right);
        }
    }
    // Main Class
    public static void main(String[] args) {
        //int[] arr = { 8, 7, 3, 2, 0, 1, 6, 5, 4, 9 };
        // User input function/method
        System.out.print("Enter array size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        
        // Add elements in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array values [" + (i + 1) + "]: ");
            arr[i] = input.nextInt();
        }
        // Display Output
        System.out.print("Unsorted array: ");
        System.out.print(Arrays.toString(arr));

        Quicksort.quickSort(arr, 0, size - 1);
        System.out.print("\nSorted array: ");
        System.out.print(Arrays.toString(arr));
    }
}
