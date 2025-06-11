public class SquareDigitRoot {

    public static int calculateTotal(String value) {
       /* int res=0 ;
        for(char c : value.toCharArray()){
            int digit = Character.getNumericValue(c);
            res+=digit*digit;
        }
        return singleValue(res);*/
        int res = value.chars().map(Character::getNumericValue).map(d->d*d).sum();
        return singleValue(res);

    }
    private static int singleValue(int sum) {
        /*int temp =0;
        if(res<10){
            return res;
        }
        while(res>0){
            temp+=res%10;
            res=res/10;
        }
        return singleValue(temp)*/;

        while(sum>=10){
             sum = String.valueOf(sum).chars().map(Character::getNumericValue).sum();
        }
        return sum;
    }

    public static void main(String[] args) {
        String value = "12345678912";
        int r = calculateTotal(value);
        System.out.println(r);
    }
}