package diana;

import java.util.Arrays;

public class ArrayAscending {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 2, 5, 7, 0};
        arr = Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] Sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
