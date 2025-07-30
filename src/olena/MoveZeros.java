package olena;
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] array = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeros(array)));
    }

    public static int[] moveZeros(int[] array){

        int[] vedro = new int[array.length];
        for (int i = 0, j = 0; i < array.length ; i++) {
            if (array[i] != 0){
                vedro[j++] = array[i];
            }
        }
        return vedro;
    }
}
