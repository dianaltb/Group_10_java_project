package olena;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {

        List<Character> vedro = new ArrayList<>();
        for (char letter : str.toCharArray()){
            if(!vedro.contains(letter)){
            vedro.add(letter);
        }
        }

        StringBuilder builder = new StringBuilder();
        for (char letter : vedro){
            builder.append(letter);
        }

        return  builder.toString();

    }
}