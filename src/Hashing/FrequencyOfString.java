package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {
    public static void occurence(String value){
        HashMap<Character,Integer> h1 = new HashMap<>();
        char[] c1 =value.toCharArray();
        for(char s : c1){
            if(h1.containsKey(s)){
                h1.put(s,h1.get(s)+1);
            }else{
                h1.put(s,1);
            }
        }
        System.out.println(h1);
    }
    public static void main(String[] args) {
        String value = "Java J2EE Java JSP J2EE";
        occurence(value);
        Map<Character,Long> map = value.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
