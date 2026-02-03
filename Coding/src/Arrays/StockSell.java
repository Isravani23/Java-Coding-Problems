package Arrays;

public class StockSell {
    public static int bestTime(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       for(int i =0;i<nums.length;i++){
           min = Math.min(min,nums[i]);
           max= Math.max(max,nums[i]-min);
       }
        return  max;
    }
    public static int daybydaySell(int[] nums){
        int p=0, i =0, s =0 ;
        for(int j = 0;j<nums.length-1;j++){
            if(nums[j]<nums[j+1]){
                i= nums[j];
                s=nums[j+1];
                p=p+s-i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int[] nums ={7,1,5,3,6,4};
        System.out.println(bestTime(nums));
        System.out.println(daybydaySell(nums));
    }
}
