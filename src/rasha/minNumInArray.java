package rasha;

public class minNumInArray {

    //Write the method that can find min number inside of array


    public static void main(String[] args) {

        int[] nums = {81, 49, 6, 7, 80, 9, 10};

        System.out.println(minNum(nums));
    }

    public static int minNum(int[] nums) {

        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;


    }
}
