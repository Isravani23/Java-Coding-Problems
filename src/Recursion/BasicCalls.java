package Recursion;

public class BasicCalls {
    static void fun(int i ,int j){
        if(i>j) return;
        System.out.println(i);
        fun(i+1,j);

    }
    //sum
    static void sum(int n,int s){
        if(n<1) return;
        System.out.println(s);
        sum(n-1,s+n);

    }
    //factorial
    public static int factorial(int n){
        if(n==0) return 1 ;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        fun(1,4);
        sum(5,0);
        System.out.println(factorial(5));
    }
}
