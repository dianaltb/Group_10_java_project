package oleksandr;

import java.util.Arrays;

public class MoveAllZerosToLastIndex {
    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4,0};
        int[] ints = moveAllZeros(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ints));
    }

    public static int[] moveAllZeros(int[] list) {

        int[] arr = new int[list.length];
        int index = 0;

        for (int each : list) {
            if (each != 0) {
                arr[index++] = each;
            }
        }
        return arr;
    }
}