package practice;

public class Demo {
    public void binaryFormat(){
        int n=10;
        String res = Integer.toBinaryString(n);
        int c =0;
        for (int i = 0; i < res.length(); i++) {
            if(res.charAt(i)=='0'){
                c=c+1;
            }
        }
        System.out.println(res);
        System.out.println(c);
    }

    public static boolean  palindrome(){
        String s = "MADAl";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            sb.append(s.charAt(i));
        }
        return s.equals(sb.toString());
    }

     public int equilibriumIdx(int[] arr){
         int totalSum =0;
         int leftSum = 0;
        for(int item: arr){
            totalSum=totalSum+item;
        }
         for (int i = 0; i < arr.length; i++) {
             totalSum-=arr[i];
             if(totalSum==leftSum){
                 return i;
             }
             leftSum=leftSum+arr[i];
         }
         return -1;
     }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        int[] arr ={1, 3, 5, 2, 2};
        int res = d1.equilibriumIdx(arr);
        System.out.println("Index "+res);
        //d1.binaryFormat();
        // binaryFormat();
        //System.out.println(palindrome());
    }
}
