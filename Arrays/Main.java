package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Primitive Array
        //Arrays are static in size 
        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;

        // System.out.println(arr);

        //Array Lists  and Dynamic Arrays 
        // List <Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // System.out.println(list);

        MyArray arr = new MyArray(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);

        System.out.println(arr);
        arr.reverse();
        System.out.println(arr);

        // System.out.println(arr.indexOf(10));
        // // arr.removeAt(3);
        // System.out.println(arr);
        // System.out.println(arr.maxElement());
    }
}