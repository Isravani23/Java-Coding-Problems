package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static int[] removeElement(int[] nums, int val) {
        int index =0;
        for(int i =0;i<=nums.length-1;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums= {0,1,2,2,3,0,4,2};
        int val = 2;
        int[] res = removeElement(nums,val);
        System.out.println(Arrays.toString(res));
    }
}
