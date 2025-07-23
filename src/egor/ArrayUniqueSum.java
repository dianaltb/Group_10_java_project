package egor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayUniqueSum {
    public static void main(String[] args) {
        int limit = 20;
        int[] sumOfUniqueEven = getSumAsZero(limit);
        System.out.println(Arrays.toString(sumOfUniqueEven));
        System.out.println("The limit is: " + limit +
                " and Size of the array: " + sumOfUniqueEven.length);
        System.out.println("Sum of the elements is: " +
                getSum(sumOfUniqueEven));
        //[9, -9, 33, -33, 21, -21, 82, -82, 65, -65, 36, -36, 80, -80, 11, -11, 85, -85, 10, -10]
        //The limit is: 20 and Size of the array: 20
        //Sum of the elements is: 0
        System.out.println("======================");

        limit = 19;
        int[] sumOfUniqueOdd = getSumAsZero(limit);
        System.out.println(Arrays.toString(sumOfUniqueOdd));
        System.out.println("The limit is: " + limit +
                " and Size of the array: " + sumOfUniqueOdd.length);
        System.out.println("Sum of the elements is: " +
                getSum(sumOfUniqueOdd));
        //[32, -32, 57, -57, 35, -35, 36, -36, 37, -37, 90, -90, 75, -75, 45, -45, 97, -97, 0]
        //The limit is: 19 and Size of the array: 19
        //Sum of the elements is: 0
    }

    public static int[] getSumAsZero(int limit) {
        List<Integer> pool = getUniquePool();
        int[] result = new int[limit];
        if (limit % 2 == 0) {
            for (int i = 0; i < result.length; i += 2) {
                int num = pool.get(i);
                result[i] = num;
                result[i + 1] = -num;
            }
        } else {
            for (int i = 0; i < result.length - 1; i += 2) {
                int num = pool.get(i);
                result[i] = num;
                result[i + 1] = -num;
            }
            result[result.length - 1] = 0;
        }
        return result;
    }
    private static List<Integer> getUniquePool(){
        List<Integer> pool = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            int num = random.nextInt(100) + 1;
            if(!pool.contains(num)) {
                pool.add(num);
            }
        }
        return pool;
    }

    private static int getSum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
}
