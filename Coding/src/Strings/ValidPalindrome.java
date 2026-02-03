package Strings;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
       /* Java 8
       boolean is = IntStream.range(0,s1.length()/2)
                .noneMatch(i->s1.charAt(i)!=s1.charAt(s1.length()-i-1));
        System.out.println(is);*/
        boolean res = isPalindrome(str);
        System.out.println(res);
    }
}
