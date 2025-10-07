package Hashing;

import java.util.*;
import java.util.stream.Collectors;

public class KeyValue {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(111, "Joshua Helfhanaus");
        map.put(222, "Vedant Joshi");
        map.put(333, "Ben Mitchael");
        map.put(444, "Poorvi Shah");
        map.put(555, "Wnag Chama");
        System.out.println(map.containsKey(111));
        System.out.println(map.containsValue("Srav"));
        List<Integer> ls = map.keySet().stream().toList();
        System.out.println("List--"+ls);
        List<String> list = map.values().stream().toList();
        System.out.println("List==="+list);
        List<Map.Entry<Integer,String>> entryList = map.entrySet().stream().toList();
        System.out.println(entryList);
        int[] inputArray = {4, 7, 2, 9, 1, 7, 1, 4, 7, 8};
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i : inputArray)
        {

            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        System.out.println(hashMap);
        Set<Map.Entry<Integer, Integer>> set = hashMap.entrySet().stream()
                .filter(i->i.getValue()>1).collect(Collectors.toSet());
        System.out.println(set);
    }
}
