package Arrays;

import java.util.Arrays;

public class RemoveDup {
    public static int[] removeDupSortArray(int[] arr){
        int i =1 ;
        for(int j=1;j<=arr.length-1;j++){
            if(arr[i-1]!=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeDupSortArray(a)));
    }
}
