import java.util.*;

public class SlotMachine {
    public static int getMaxColumnSum(List<Integer> numbers) {
        // Convert each number into a list of digits with padding
        int maxLength = 0;
        List<int[]> digitRows = new ArrayList<>();

        for (int num : numbers) {
            String s = String.valueOf(num);
            System.out.println(s);
            maxLength = Math.max(maxLength, s.length());
        }

        for (int num : numbers) {
            String s = String.format("%" + maxLength + "s", String.valueOf(num)).replace(' ', '0');
            System.out.println("valu" +s);
            int[] digits = new int[maxLength];
            for (int i = 0; i < maxLength; i++) {
                digits[i] = s.charAt(i) - '0';
            }
            digitRows.add(digits);
        }

        int sum = 0;
        for (int col = 0; col < maxLength; col++) {
            int max = 0;
            for (int[] row : digitRows) {
                max = Math.max(max, row[col]);
            }
            sum += max;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 123, 345, 567);
        int result = getMaxColumnSum(numbers);
        System.out.println(result);
    }
}