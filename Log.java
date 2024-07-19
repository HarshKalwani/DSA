public class Log {
    public static void main(String[] args) {
        //Binary search 
        int[] arr = new int[]{2,5,10,20,40,60};

        //Task is to find 40 in the given array 
        for(int i = 0 ; i < arr.length ; i++){   //T.C = o(n)
            if(arr[i] == 40){
                System.out.println("Found 40 at index " + i);
            }
        }


        //Good Way 


        // int start = 0 ;
        // int end  = arr.length-1;
        // while (start <=end) {
        //     int mid  = (start+end) /2;
        //     if(arr[mid] == 40){
        //         System.out.println("Found 40 at " + mid);
        //         break;
        //     }else if(arr[mid] < 40){
        //         start = mid+1;
        //     }else{
        //         end = mid-1;
        //     }
        // }
    }
}
