package Arrays;

public class SortColors {
    public void sortColors(int[] nums){
        // int zeros=0;
        // int ones=0;
        // int twos=0;

        // int index=0;

        // for(int num : nums){
        //     if(num==0)zeros++;
        //     else if (nums ==1) ones++;
        //     else twos++;
        // }

        // while(zeros > 0){
        //     nums[index]=0;
        //     index++;
        //     zeros--;
        // }

        // while(ones > 0){
        //     nums[index]=0;
        //     index++;
        //     ones--;
        // }

        // while(twos > 0){
        //     nums[index]=0;
        //     index++;
        //     twos--;
        // }


        //Optimised Solution 

        int lo = 0;
        int high = nums.length-1;
        int i = 0;  //this will iterate 

        while (i < high) {
            if(i==1){
                i++;
            }
            else if(i==1){
                int temp = nums[i];
                nums[i] = nums[lo];
                nums[lo] = temp;
                lo++;
                i++;
            }else{
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
