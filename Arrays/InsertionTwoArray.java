package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InsertionTwoArray {
    public int[] insertion(int[]num1 , int[]num2){
        // int[] newArr = new int[10];
        // for(int i = 0 ; i < num1.length-1 ; i ++){
        //     for(int j = 0 ; j < num2.length-1 ; j++){
        //         if(num1[i]==num2[j]){
        //             newArr[i]=num1[i];
        //         }
        //     }
        // }
        // return newArr;


        Arrays.sort(num1);
        Arrays.sort(num2);

        int i = 0;
        int j = 0 ;

        Set<Integer> set = new HashSet<>();

        while (i < num1.length && j < num2.length) {
            if(num1[i] == num2[j]){
                set.add(num1[i]);
                i++;
                j++;
            }else if(num1[i] < num2[j]){
                i++;
            }else j++;
        }

        int[] result = new int[set.size()];
        int index=0;

        for(var num : set){
            result[index] = Integer.parseInt(num.toString());
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        InsertionTwoArray inter = new InsertionTwoArray();
        int[]num1 = new int[]{9,4,9,8,4};
        int[]num2 = new int[]{4,9,5};

        System.out.println(Arrays.toString(inter.insertion(num1, num2)));
    }
}
