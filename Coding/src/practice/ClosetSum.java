package practice;

import java.util.Arrays;

public class ClosetSum {
    public static int closet3Sum(int[] nums,int t){
        Arrays.sort(nums);
        int  closetSum = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<nums.length;i++){
            int j=i+1,  k= nums.length-1;
            while(j<k){
                int currentSum = nums[i]+nums[j]+nums[k];
                if(Math.abs(currentSum-t)<Math.abs(closetSum-t)){
                    closetSum=currentSum;
                }
                else if(currentSum==t) return currentSum;
                else if(currentSum<t) j++;
                else k--;
            }
        }
        return closetSum;
    }
    public static void main(String[] args) {
       /* Input: nums = [-1,2,1,-4], target = 1
        Output: 2
        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/
        int[] nums = {-2,0,1,3};
        int t = 2;
        int res = closet3Sum(nums,t);
        System.out.println(res);

    }
}
