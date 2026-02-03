package Hashing;

import java.util.*;

public class FailFastIterators {
    public static void mapiterator(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry);
            if(entry.getKey().equals("A")){
                //map.remove(entry.getKey());
                itr.remove();
                System.out.println(map);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(2);
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()){
            if(it.next()==2){
                //will throw Exception
                ll.remove(1);
                // will not throw Exception
                it.remove();
            }
        }
        //System.out.println(ll);
        mapiterator();
     }
}
