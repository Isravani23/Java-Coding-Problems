package Strings;

import java.util.*;

public class FrequencySort {
    public static String frequencySort(){
        String s = "tree";
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> l = new ArrayList<>(map.keySet());
        Collections.sort(l,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char ch : l){
            for(int i =0 ;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
       return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort());
    }
}
