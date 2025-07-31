package rasha;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        // Write the method that can move all the zeros to the last indexes of the array
        // (Do not use sort)
        // input = {1,0,2,0,3,0,4,0};
        // output =[1,2,3,4,0,0,0,0];

        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};

        System.out.println(Arrays.toString(moveZeros(input)));

    }

    public static int[] moveZeros(int[] arr) {

        ArrayList<Integer> temp = new ArrayList();
        ArrayList<Integer> temp2 = new ArrayList();

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            if (num != 0) {
                temp.add(num);
            } else {
                temp2.add(num);
            }
        }

        temp.addAll(temp2);

        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

}
