import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;


public class StringExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1apple", "2pineapple", "grapes", "orange", "7tomato", "strawberry");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> output = list.stream().filter(s->Character.isDigit(s.charAt(0))).collect(Collectors.toList());
        System.out.println("Int String"+output);
    //frequency
        String s = "sssrraavaniii";
        Map<String,Long> count  = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),counting()));
        System.out.println("frequency char "+count);
        Map<String,Long> count2 = listOfStrings.stream().distinct().collect(Collectors.groupingBy(m->m,counting()));
        System.out.println("Frequency strings"+count2);
    //Accesnding order
        String sorted = s.chars().mapToObj(c->(char)c).sorted().map(String::valueOf).collect(Collectors.joining());
        System.out.println("Sorted String: "+sorted);
    // remove duplicates
        List<String> unique = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique "+unique);
        List<Character> uniqueChar = s.chars().mapToObj(c->(char)c).distinct().collect(Collectors.toList());
        System.out.println("UniqueChar "+uniqueChar);
    //Joined String
        String joined = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println("JoinedString "+joined);
    //Anagrams
        String s1 = "sssrraa";
        String l1 = Stream.of(s.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        String l2 = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        if(l1.equals(l2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("NO");
        }
    // SUM
        String value = "98765323";
        int sum = value.chars().map(Character::getNumericValue).map(d->d*d).sum();
        System.out.println("Sum "+sum);
    //String length
        Collections.sort(listOfStrings, Comparator.comparingInt(String::length).reversed());
        System.out.println("String length Acc"+listOfStrings);
    //Reverse Each Word
        String word = "This is Java";
        String rev = Arrays.stream(word.split(" ")).map(w->new StringBuilder(w).reverse().toString()).collect(Collectors.joining(" "));
        List<String> v1= Arrays.asList(word.split(" "));
        Collections.reverse(v1);
        String rev1 =String.join(" ",v1);
        System.out.println("REV "+rev);
        System.out.println("REV "+rev1);


    }

}

