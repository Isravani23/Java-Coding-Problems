import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class Streams {
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
    public static void main(String[] args) {
    //primeNumbers();
    //squre odd
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> squre = inputList.stream().filter(n -> n / 2 == 1).map((i -> i * i)).collect(Collectors.toList());
        System.out.println(squre);
    //Employee Highest Salary
        HashMap<String, Integer> map = new HashMap<>();
        map.put("sai", 18000);
        map.put("ram", 10100);
        map.put("raja", 30000);
        map.put("srav", 30000);
        int maxSalary = Collections.max(map.values());
        System.out.println("high: " + maxSalary);
        List<String> highSalary = map.entrySet().stream().filter(e -> e.getValue() == maxSalary).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Persons" + highSalary);
        List<String> sort = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("sorted " + sort);
    //grater element
    //int high = Collections.max(nums);//int min = Collections.min(nums);
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 10, 13, 17, 21);
        int high = nums.stream().max(Integer::compareTo).orElse(0);
        int min = nums.stream().min(Comparator.naturalOrder()).orElse(0);
        System.out.println("MIN " + min);
        System.out.println("First High " + high);

    // second highestNum
        int secondHigh = nums.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().orElse(0);
        System.out.println("Second High " + secondHigh);
    //sum
    //int sum = nums.stream().mapToInt(i -> i).sum();
    //IntSummaryStatistics avg = nums.stream().collect(Collectors.summarizingInt(Integer::intValue));
        int[] arr = {2, 3, 4, 5, 6, 7, 10, 13, 17, 21};
        int sum = Arrays.stream(arr).sum();
        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println("AVG " + avg);
        System.out.println("SUM " + sum);
    //int rev1= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

    //reverse order
        List<Integer> rev = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse " + rev);
    // 3 max and min values
        List<Integer> maxThree = nums.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("maxThree " + maxThree);
        List<Integer> minThree = nums.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("min Three " + minThree);
    //multiple 5
        List<Integer> multiple = nums.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
        System.out.println("Multiple " + multiple);
    //Merge List
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> mergedList = Stream.of(list1, list2)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("mList" + mergedList);
        int[] a = new int[]{4, 2, 7, 1};
        int[] b = new int[]{8, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println("Merged Array: " + Arrays.toString(c));
    //Common Elements
        List<Integer> l1 = Arrays.asList(1, 2, 2, 3, 4);
        List<Integer> l2 = Arrays.asList(2, 2, 4, 5, 6);
        List<Integer> l3 = l1.stream().filter(l2::contains).collect(Collectors.toList());
        System.out.println("Common Elements  "+l3);
        List<Integer> a1 = IntStream.of(a).boxed().collect(Collectors.toList());
        Collections.reverse(a1);
        System.out.println("reverse array "+a1);

    }

}
