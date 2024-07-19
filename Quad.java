public class Quad {
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,5,10,0,5,6,25,30};
        int target = 10;

        //find the pairs whose sum is equal to the target=10
        for(int i  = 0 ; i < arr.length ; i++){ //Tc-o(n)
            for(int j = i+1 ; j < arr.length ; j++){  // Tc-o(n)
                if(arr[i] + arr[j] == target){
                    System.out.println("Pair : " + arr[i] + " " + arr[j]);
                }
            }
        }

    }
}


//O(n) + o(n) = O(n^2) Quadratic
