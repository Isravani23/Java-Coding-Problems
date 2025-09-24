package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsCount {
    public static void count(String i){
        HashMap<Character,Integer> h1 = new HashMap<>();
        char[] ch = i.toCharArray();
        for(char c:ch){
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)+1);
            }else{
                h1.put(c,1);
            }
        }
        Set<Character> s = h1.keySet();
        for(char c:s){
            if(h1.get(c)>1){
                System.out.println(c+" Dup----"+h1.get(c));
            }
        }

    }
    public static void main(String[] args) {
        String s = "Better Butter";
        Map<Character,Long> map = s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Set<Map.Entry> set = map.entrySet().stream().filter(c->c.getValue()>1).collect(Collectors.toSet());
        //System.out.println(set);
        count(s);
    }
}
