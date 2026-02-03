package Arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static int[] operations(int[] arr){
        for(int i =0 ;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
        }
        int r=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[r];
                arr[r]=temp;
                r++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,0};
        System.out.println(Arrays.toString(operations(arr)));
    }
}
  /* Input: nums = [1,2,2,1,1,0]
        Output: [1,4,2,0,0,0]
        Explanation: We do the following operations:
        - i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
                - i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
        - i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
                - i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
        - i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
        After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].*/