package DailyQuestion;

public class CheckIfDigitsAreEqual {
    public static boolean hasSameDigits(String s) {

        return true;
    }

    public static void main(String[] args) {
        String s = "3902";
        System.out.println(hasSameDigits(s));
    }
}
/*Input: s = "3902"
    Output: true
    Explanation:
    Initially, s = "3902"
    First operation:
            (s[0] + s[1]) % 10 = (3 + 9) % 10 = 2
            (s[1] + s[2]) % 10 = (9 + 0) % 10 = 9
            (s[2] + s[3]) % 10 = (0 + 2) % 10 = 2
    s becomes "292"*/
