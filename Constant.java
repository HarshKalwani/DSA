public class Constant {
    // Constant O(1)
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        // add 10 to the first element of an array
        arr[0] = arr[0] + 10; // tc=o
        System.out.println(arr[0]);
    }
}
