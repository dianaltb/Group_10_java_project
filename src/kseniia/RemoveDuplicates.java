package kseniia;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

           public static void main(String[] args) {
            System.out.println(removeDuplicates("AAABBBCCC"));
        }


        public static String removeDuplicates(String str) {

            Set<Character> removedDup = new LinkedHashSet<>();

            for (char each : str.toCharArray()) {
                removedDup.add(each);
            }

            StringBuilder resultStr = new StringBuilder();
            for (char each : removedDup) {
                resultStr.append(each);
            }
            return resultStr.toString();
        }



    }

