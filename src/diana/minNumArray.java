package diana;

public class minNumArray {
    public static void main(String[] args) {

        int[] array = {3, 7, 2, 8, 9};
        System.out.println("findMinArray(array) = " + findMinArray(array));
    }

    public static int findMinArray(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

}