package Math;

public class ArmstrongNum {
    public static  boolean amstrong(int n){
        int k = String.valueOf(n).length();
        int sum =0 ; int num = n;
        while(num>0){
            int i = num%10;
            sum+=Math.pow(i,k);
            num=num/10;
        }
        return sum==n?true:false;
    }
    public static void main(String[] args) {
        boolean r = amstrong(153);
        System.out.println(r);
    }
}
