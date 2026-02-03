package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestElement {
    public static int secondLargeElement(int[] nums){
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>large){
                second_large=large;
                large=nums[i];
            }else if(nums[i]>second_large && nums[i]!=large){
                 second_large=nums[i];
            }
        }
        return second_large;
    }

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
        int[] nums =  {3, 3, 0, 99, -40, 70};
       /* int t = Arrays.stream(nums).max().getAsInt();
        int s = Arrays.stream(nums).min().getAsInt();*/
        int sec_large = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(sec_large);
        System.out.println(largeValue(nums));
        System.out.println(secondLargeElement(nums));
    }
}
