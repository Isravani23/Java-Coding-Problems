package practice;

import java.util.Arrays;

public class ThreeSumSmaller {
    public static int threeSumLessthanTarget(int[] nums,int t){
        Arrays.sort(nums);
        int c = 0;
        for(int i = 0;i<nums.length-2;i++){
            int left=i+1,  right= nums.length-1;
            int sum = nums[i]+nums[left]+nums[right];
            while(left<right) {
                if (sum < t) {
                    c += right - left;
                    left++;
                }else right--;
            }

        }
        return c;
    }
    public static void main(String[] args) {
       /* Input: nums = [-1,2,1,-4], target = 1
        Output: 2
        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/
        int[] nums = {-2,0,-1,3};
        int t = 2;
        int res = threeSumLessthanTarget(nums,t);
        System.out.println(res);

    }
}
