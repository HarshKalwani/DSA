package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1 , int m , int nums2[] , int n){
        int index = 0;
        for(int i = m ; i < nums1.length ; i ++){
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    public static int[] fastMerge(int[] nums1 , int m , int nums2[] , int n){
        int i =0; //nums1
        int j = 0; //nums2

        int[] arr = new int[nums1.length];
        int index = 0;
        while (i < m && j < n) {
            if(nums1[i] <= nums2[j]){
                arr[index] = nums1[i];
                index++;
                i++;
            }else{
                arr[index] = nums2[j];
                index++;
                j++;
            }
        }

        while (i < m) {
            arr[index] = nums1[i];
            index++;
            i++;
        }

        while (j < n) {
            arr[index] = nums2[j];
            index++;
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m =3;
        int n = 3;

        var st = System.nanoTime();
        // merge(nums1, m, nums2, n);
        int[] neww = fastMerge(nums1, m, nums2, n);
        var ed = System.nanoTime();
        // System.out.println(Arrays.toString(nums1) + (ed-st));


        System.out.println(Arrays.toString(neww) + (ed-st));
    }
}
