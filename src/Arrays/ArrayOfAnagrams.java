package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfAnagrams {
    public static boolean isAnagram(String s1, String s2){
        int[] freq = new int[26];
        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            freq[c-'a']--;
        }
        for(int c : freq){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    public static List<String> anagram(String[] arr){
        List<String> res = new ArrayList<>();
        res.add(arr[0]);
        for(int i =1;i<arr.length;i++){
            if(!isAnagram(res.get(res.size()-1),arr[i])){
                res.add(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String[] arr ={"abba","baba","bbaa","cd","cd"};
        System.out.println(anagram(arr));
    }
}
