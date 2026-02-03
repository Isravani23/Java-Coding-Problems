package Math;

import java.util.ArrayList;

public class AllDivisors {
    public static boolean primenumber(int n){
        int c=0;
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c=c+1;
                if(n/i!=i){
                    c=c+1;
                }
            }
            if(n!=2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1 ;i<n;i++){
            if(n%i==0){
                res.add(i);
            }
        }
        System.out.println(res);
        boolean result = primenumber(2);
        System.out.println(result);
    }
}
