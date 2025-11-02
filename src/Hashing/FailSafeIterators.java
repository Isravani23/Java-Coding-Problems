package Hashing;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterators {
    public static void concurrentMap(){
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("A",1);
        map.put("B",2);
        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            //System.out.println(entry);
            if(entry.getKey().equals("B")){
                map.remove("B",2);
                System.out.println(map);
            }
        }
    }
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> ll = new CopyOnWriteArrayList<>();
        ll.add(1);
        ll.add(2);
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()){
            if(it.next()==2){
                //will throw Exception
                ll.remove(1);
                // will throw Exception b/e it Throws UnsupportedOperationException
                //it.remove();
            }
        }
        //System.out.println(ll);
        concurrentMap();
    }

}
