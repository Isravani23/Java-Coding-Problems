package practice;

public class MedianOfTwoSortedArray {
    /*Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.*/
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 4, 5};
        int[] num2 = new int[]{3, 7, 9};
        double r = midOfSortedArray(nums1, num2);
        System.out.println(r);


    }

    private static double midOfSortedArray(int[] nums1, int[] nums2) {
      /*  int i =0 ,j =0 ;
        int k=nums1.length+nums2.length;
        int[] res = new int[k];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                res[i]=nums1[i];
                i++;
            }else{
                res[i]=nums2[j];
                j++;
            }
        }
        while(i< nums1.length){
            res[i]=nums1[i];
            i++;
        }
        while(j< nums2.length){
            res[j]=nums2[j];
            j++;
        }
        if (k % 2 == 1) {
            return (double) res[(k / 2)];
        }

        double median = ((double) res[(k / 2)] + (double) res[((k / 2) - 1)]) / 2.0;
        return median;
    }*/


        int n1 = nums1.length, n2 = nums2.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return midOfSortedArray(nums2, nums1);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; //dummy statement
    }
}

