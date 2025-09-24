package Arrays;

import java.util.Arrays;

public class LargestElement {
    public static int largeValue(int[] nums){
        int t = nums[0];
        for(int j=1;j<nums.length;j++){
            if(t<nums[j]){ // if we want small just reverse the condition
                t=nums[j];
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[] nums =  {3, 3, 0, 99, -40};
        int t = Arrays.stream(nums).max().getAsInt();
        int res = largeValue(nums);
        System.out.println(t);
    }
}
