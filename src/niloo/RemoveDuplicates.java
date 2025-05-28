package niloo;

/*
Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }

// Return method for removing duplicates from String
    public static String removeDuplicates(String str) {
// in LinkedHashSet duplicates will be removed
        Set<Character> removedDup = new LinkedHashSet<>();

        for (char each : str.toCharArray()) {
            removedDup.add(each);
        }
// we use string builder and append each char of removedDup(LinkedHashSet) to our resultStr
        StringBuilder resultStr = new StringBuilder();
        for (char each : removedDup) {
            resultStr.append(each);
        }
        return resultStr.toString();
    }



}
