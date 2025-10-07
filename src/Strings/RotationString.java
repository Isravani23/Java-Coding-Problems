package Strings;

public class RotationString {
    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "Sravani";
        String s3 = s1+s1;
        if(s1.length()!=s2.length()){
            System.out.println("Not a Rotated String");
        }else{
            if(s3.contains(s2)){
                System.out.println("Rotated String");
            }else{
                System.out.println("Not a Rotated String");
            }
        }

    }
}
