package Arrays;

public class SortedAndRotatedArray {
    public boolean check(int[] nums){
        int gCount = 0;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i-1] > nums[i]){
                gCount++;
            }
        }

        if(nums[nums.length-1] > nums[0]){
            gCount++;
        }

        return gCount <=1;
    }
}
