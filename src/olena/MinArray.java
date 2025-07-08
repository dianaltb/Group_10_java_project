package olena;

public class MinArray {
    public static void main(String[] args) {
        int[] nums = {3,5,8,9};
        System.out.println(minArray(nums));
    }


    public static int minArray ( int[] nums) {
        int minNum = nums[0];
        for (int n : nums) {
            if (n < minNum  ) {
                minNum = n;
            }
        }
        return minNum;

    }
    }
