package Arrays;

public class AdjacentSubArray {
    public static boolean increasingSubArray(int[] nums, int k){
        int n = nums.length;
        for(int i =0;i<n-2*k;i++){
            if(isIncreasing(nums,i,i+k-1)&&isIncreasing(nums,k+i,i+2*k-1)){
                return true;
            }
        }
        return false;

    }
    public static boolean isIncreasing(int[] nums,int start, int end){
        for(int i = start;i<end;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        Input: nums = [2,5,7,8,9,2,3,4,3,1], k = 3
//        Output: true
//        Explanation:
//        The subarray starting at index 2 is [7, 8, 9], which is strictly increasing.
//        The subarray starting at index 5 is [2, 3, 4], which is also strictly increasing.
//                These two subarrays are adjacent, so the result is true.
        int[] nums = {2,5,7,8,9,2,3,4,3,};
        int k =3;
        System.out.println(increasingSubArray(nums,k));
    }
}
