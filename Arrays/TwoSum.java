package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] sum(int[] nums , int target){
        // int size = nums.length;
        // for(int i = 0; i < size-1 ; i++){
        //     int targettedNumber = target - nums[i];
        //     for(int j = i+1 ; j < size ; j++){
        //         if(nums[j] == targettedNumber){
        //             return new int[] {i , j};
        //         }
        //     }
        // }
        // return new int[]{-1};

        //Optical way
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i <nums.length ; i++){
            int targettedNumber = target - nums[i];
            if(map.containsKey(targettedNumber)){
                //We found Sol
                return new int[]{map.get(targettedNumber), i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1};
    }
}
