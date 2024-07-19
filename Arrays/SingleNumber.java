package Arrays;

public class SingleNumber {
    public static int single(int[] arr){
        int ans = 0;
        for(int num : arr){
            ans = ans ^ num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = new int[]{5,8,1,8,1};
        System.out.println(SingleNumber.single(arr));
    }
}
