package Strings;

public class SubStrings {
    public static String printSubStrings(String s){
        for(int i =0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length()-1;j++){
                System.out.println(s.substring(i,j));
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s = "substrings";
        printSubStrings(s);
    }
}
