import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        squreOdd();
        highestSalary();
        primeNumbers();

    }
    // Printing square of odd numbers
    public static void squreOdd(){
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> result= inputList.stream().filter(n->n%2!=0)
                .map(i->i*i).collect(Collectors.toList());
        System.out.println(result);
    }
    // Highest salary
    public static void highestSalary(){
       HashMap<String,Integer> map = new HashMap<>();
       map.put("sai",10000);map.put("ram",20000);map.put("raja",30000);map.put("srav",30000);
       int maxSalary = Collections.max(map.values());
       List<String> emp = map.entrySet().stream()
                                        .filter(e->e.getValue()==maxSalary)
               .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("highest salary "+maxSalary+" belongs to "+emp);
        List<String> sort = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(sort);

    }
    // Prime numbers
    public static void primeNumbers(){
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 10, 13, 17, 21);
        List<Integer> primes = nums.stream().filter(Streams::isPrime).collect(Collectors.toList());
        System.out.println("Prime numbers: " + primes);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    
}
