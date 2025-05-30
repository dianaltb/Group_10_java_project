package egor;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("1.Stream + loop: " + removeDup1("AAABBBCCC"));
        System.out.println("2.Stream + sb1: " + removeDup2("AAABBBCCC"));
        System.out.println("3.Stream + sb2: " + removeDup3("AAABBBCCC"));
        System.out.println("4.Set + 2 loops: " + removeDup4("AAABBBCCC"));
        /*
        1.Stream + loop: ABC
        2.Stream + sb1: ABC
        3.Stream + sb2: ABC
        4.Set + 2 loops: ABC
         */

    }

    public static String removeDup1(String str) {
        StringBuilder builder = new StringBuilder();
        Set<Character> set = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        for (char ch : set) {
            builder.append(ch);
        }
        return builder.toString();
    }

    public static String removeDup2(String str) {
        return str.chars()
                .distinct()
                .collect(StringBuilder::new,
                        (sb, c) -> sb.append((char) c),
                        StringBuilder::append)
                .toString();
    }

    public static String removeDup3(String str) {
        return str.chars()
                .distinct()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public static String removeDup4(String str) {
        Set<Character> set = new LinkedHashSet<>();
        String result = "";
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        for (char ch : set) {
            result += ch;
        }
        return result;
    }
}

