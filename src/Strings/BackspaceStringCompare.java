package Strings;

public class BackspaceStringCompare {
    boolean backspaceCompare(String s, String t){
        return compare(s).equals(compare(t));
    }
    private static String compare(String k){
        StringBuilder sb = new StringBuilder();
        int hashCount = 0;
        for(int i = k.length()-1;i>=0;i--){
            if(k.charAt(i)=='#'){
                hashCount++;
                continue;
            }
            if(hashCount>0){
                hashCount--;
            }else{
                sb.insert(0,k.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c" ;
        BackspaceStringCompare st = new BackspaceStringCompare();
        System.out.println(st.backspaceCompare(s,t));
    }
}
