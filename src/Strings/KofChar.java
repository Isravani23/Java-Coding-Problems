package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class KofChar {
    /*Take K of Each Character From Left and Right
    Input: s = "aabaaaacaabc", k = 2
    Output: 8
    Explanation:
    Take three characters from the left of s. You now have two 'a' characters, and one 'b' character.
    Take five characters from the right of s. You now have four 'a' characters, two 'b' characters, and two 'c' characters.
    A total of 3 + 5 = 8 minutes is needed.
    It can be proven that 8 is the minimum number of minutes needed.*/
    public static void main(String[] args) {
        String s = "aabaaaacaabc";
        int k =2;
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        int a =0; int b=0; int c=0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]=="a"){
                a++;
            }else if(arr[i]=="b"){
                b++;
            }else c++;
        }


    }
}
