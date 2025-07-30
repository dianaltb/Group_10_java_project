package egor;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] unsorted = {10, 9, 8, 7};
        int[] sorted = getSorted(unsorted);
        System.out.println(Arrays.toString(sorted));
        //[7, 8, 9, 10]
    }

    public static int[] getSorted(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j - 1] > nums[j]){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
