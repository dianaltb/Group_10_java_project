package niloo;

import java.util.Arrays;

import static java.util.Collections.sort;

public class SortIntArrayAscending {

    /*
    Write a return method that can sort an Int array in ascending order
    without using sort() method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = sort(arr);  ===> {7, 8, 9, 10};
     */
    int[] arr = {10, 9, 8, 7};
    public static int[] sortInAscendingOrder(int[] arr){


        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the smallest element
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sortInAscendingOrder(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    }

