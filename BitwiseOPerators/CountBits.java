package BitwiseOPerators;

import java.util.Scanner;

public class CountBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =sc.nextInt();
        
        int arr[] = new int[n+1];
        int i = 0;
        int j = 0;

        while (i<=n) {
            int count = 0;
            int temp = i;
            while (temp !=0){
                if((temp&1)==1){
                    count++;
                }
                temp = temp>>1;
            }
            arr[i] = count;
            i++;
        }

        for(j= 0 ; j<=n ; j++){
            System.out.println(arr[j] + " ");
        }
    }
}
