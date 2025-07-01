package rasha;

import java.util.HashMap;
import java.util.Map;

public class passwordChecker {

    public static void main(String[] args) {

        String word = "Catdogmouse2!";

        System.out.println(passChecker(word));


    }

    public static boolean passChecker(String pasword) {

        Map<String, Object> map = new HashMap<>();

        if (pasword.length() < 6) {
            return false;
        }
        char[] arr = pasword.toCharArray();

        for (char eachChar : arr) {
            if (Character.isUpperCase(eachChar)) {
                map.put("upper", eachChar);
            } else if (Character.isDigit(eachChar)) {
                map.put("digit", eachChar);
            } else if (Character.isLowerCase(eachChar)) {
                map.put("lower", eachChar);
            } else if (!Character.isLetterOrDigit(eachChar)) {
                map.put("special", eachChar);
            }
        }

        return (map.containsKey("upper") && map.containsKey("lower")
                && map.containsKey("special") && map.containsKey("digit"));


    }
}
