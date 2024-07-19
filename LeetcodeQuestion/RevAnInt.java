package LeetcodeQuestion;

public class RevAnInt {

    public int reverse (int n){
        int res = 0;
        while (n !=0) {
            int lastDigit = n%10;
            res = res*10 + lastDigit;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        RevAnInt revv = new RevAnInt();
        System.out.println(revv.reverse(-12345));
    }
}
