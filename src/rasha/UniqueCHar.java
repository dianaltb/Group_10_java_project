package rasha;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCHar {

    //      Write a return method that can find the unique characters from the String
    //         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        StringBuilder sb = new StringBuilder();
        for(char each: str.toCharArray()){
            if ( str.indexOf(each)== str.lastIndexOf(each)){
                sb.append(each);
            }
        }
        System.out.println(sb);
    }
}
