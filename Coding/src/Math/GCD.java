package Math;
/*Example 1:
Input:N1 = 9, N2 = 12
Output:3
Explanation:Factors of 9: 1, 3 and 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.*/
public class GCD {
    public static int gratestDivisor(int n1, int n2){
        /*int gcd =1;
        for(int i =1 ;i<Math.min(n1,n2);i++){
            if(n1%i==0&&n2%i==0){
                gcd=i;
            }
        }
        return gcd;*/

        //Euclidean Algorithm
        while(n1>0&&n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            return n2;
        }else{
            return n1;
        }
    }
    public static void main(String[] args) {
        int res = gratestDivisor(20,15);
        System.out.println(res);
    }
}
