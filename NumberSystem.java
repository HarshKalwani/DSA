import java.util.Scanner;

class Convertor{

    public int toDecimal(int binnu){
        int res = 0;
        int index = 0;
        while (binnu != 0){
            int lastDigit = binnu %10;
            if(lastDigit ==1){
                res = res + (int)Math.pow(2,index);
            }
            index=index +1;
            binnu=binnu/10;
        }
        return res;
    }

    public String toBinary (int decimal){
        //converting decimal number to binary 
        String res = "";
        while (decimal !=0) {
            int lastBit = decimal & 1;
            res = lastBit+res;
            decimal = decimal >> 1;
        }
        return res;
    }
}


public class NumberSystem {
    public static void main(String[] args) {
        //Decimal to binary 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Decimal Number");
        // int number  = sc.nextInt();
        // String result = "";

        // while (number > 0) {
        //     int rem = number % 2;
        //     number = number /2;
        //     result = rem + result;
        // }
        // System.out.println(result);

        Convertor convertor = new Convertor();
        System.out.println(convertor.toBinary(10));
        System.out.println(convertor.toDecimal(1010));
    }
}