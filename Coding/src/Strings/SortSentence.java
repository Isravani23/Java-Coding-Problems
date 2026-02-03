package Strings;

public class SortSentence {
       /*Input: s = "is2 sentence4 This1 a3"
    Output: "This is a sentence"*/
    public static String  sortSentence(String s){
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        for(String st : arr){
            int index = st.charAt(st.length()-1)-'1';
            result[index] = st.substring(0,st.length()-1);
        }
        return String.join(" ",result);
    }
    public static boolean numSortString(String str){
        String[] arr = str.split(" ");
        int s1 = Integer.MIN_VALUE;
        for(String s: arr ){
            if(s.matches("\\d+")){
                int t = Integer.parseInt(s);
                if(s1<=t){
                    return false;
                }
                s1=t;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        //System.out.println(sortSentence(s));
        String str ="hello world 5 x 5";
        System.out.println(numSortString(str));
    }
}
