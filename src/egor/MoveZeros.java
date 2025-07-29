package egor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
    public static void main(String[] args) {
        int[] original = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(original));
        int[] result = moveZeros(original);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZeros(int[] arr) {
        int[] result = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num != 0){
                list.add(num);
            }
        }
        while(list.size() <= arr.length){
            list.add(0);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
