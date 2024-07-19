public class Linear {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        //Add 10 to first element 
        arr[0] = arr[0]+10; //o(1) T.C | SC - o(1)

        //Task - To print each element of array 
        for(int i =0 ; i < arr.length ; i++){   //o(n) time.C  | SC-o(1)
            System.out.println(arr[i]);
        }

        System.out.println(arr[0]);  //T.C = O(1) | SC = O(1)

        //Copy the elements of one Array to another 
        int[] newArray = new int[arr.length]; //TC= o(1) | S.C O(n)

        for(int i = 0 ; i < newArray.length ; i++){  //T.C - o(n) | SC-o(1)
            newArray[i] = arr[i];
        }

        for(int num : newArray){  //TC-o(n) | SC-o(1)
            System.out.println(num);
        }

        //Total TC = o(1) + o(1) + o(n) = O(2+n) = o(n) Linear T.C  (as constants should be ignored )
        //Total SC = o(1)


        //Over all 
        //SC-1+1+1 + n +1 +1 = O(5+n) =>O(n);
        //TC-1+n+1+1+n+n = O(3+3n) = O(3*n) => O(n);
    }
}
