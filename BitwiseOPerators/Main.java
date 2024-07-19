package BitwiseOPerators;

public class Main {
    public static void main(String[] args) {
        int a = 3 ;
        int b = 4;

        System.out.println("result is : " + (a & b));
        System.out.println("result is : " + (a | b));
        System.out.println("~a :" + (~a));
        System.out.println("a ^ b is : " + (a^b));

        System.out.println(10 << 1);
        System.out.println(10 >> 1);
    }
}
