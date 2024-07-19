package Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums){
        //EX solution not an optimised way 
        int index = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] != 0 ){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i = index ; i < nums.length ; i++){
            nums[i] = 0;
        }
    }
}
