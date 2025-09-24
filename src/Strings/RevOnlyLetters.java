package Strings;

public class RevOnlyLetters {
    public static void reverseLetters(String input){
        char[] c = input.toCharArray();
        int l=0; int r = c.length-1;
        while(l<r){
            if(c[l]==' '){
                l++;
                continue;
            }else if(c[r]==' '){
                r--;
                continue;
            }else{
                char t = c[l];
                c[l]=c[r];
                c[r]=t;
            }
            l++;
            r--;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        String s = "I Am Not String";
        reverseLetters(s);
    }
}
