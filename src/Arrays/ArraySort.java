package Arrays;

import java.util.Arrays;

public class ArraySort {
    public static int[] mergeSort (int[] a,int[] b , int m, int n){
        int i = m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0){
            if(a[i]>b[j]){
                a[k--]=a[i--];
            }else {
                a[k--]=b[j--];
            }
        }
        while(j>=0){
            a[k--]=b[j--];
        }
        return a;
    }

    public static void main(String[] args) {
        /*Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/
        int[] nums1 = {1,2,3,0,0,0} ;
        int[] nums2 = {2,5,6};
        System.out.println(Arrays.toString(mergeSort(nums1, nums2, 3, 3)));

    }
}
