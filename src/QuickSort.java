import java.util.*;
public class QuickSort {
        // Function to sort an array using quick sort algorithm.
        static void quickSort(int arr[], int low, int high) {
            // code here
            if(low<high){
                int pidx = partition(arr,low,high);
                quickSort(arr,low,pidx-1);
                quickSort(arr,pidx+1,high);
            }
        }
        static int partition(int arr[], int low, int high) {
            int pivot= arr[low];
            int i=low;
            int j=high;
            while(i<j){
                while(arr[i]<=pivot && i<=high-1){
                    i++;
                }
                while(arr[j]>pivot && j>=low+1){
                    j--;
                }
                if(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            return j;
        }

    public static void main(String args[]) {
        int[] arr = new int[] {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Quick Sort: ");
        System.out.println(Arrays.toString(arr)); // Print original array

        quickSort(arr, 0, n - 1); // Fix: Use correct function call

        System.out.println("After Quick Sort: ");
        System.out.println(Arrays.toString(arr)); // Print sorted array
    }

}







