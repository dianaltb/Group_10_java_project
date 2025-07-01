package oleksandr;

import java.util.HashMap;
import java.util.Map;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println(passwordValidation("Google123!"));
    }

    public static boolean passwordValidation(String password) {

        if (password.length() < 6) {
            return false;
        }

        Map<String, Object> map = new HashMap<>();

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isDigit(ch)) {
                map.put("digit", ch);
            } else if (Character.isUpperCase(ch)) {
                map.put("upper", ch);
            } else if (Character.isLowerCase(ch)) {
                map.put("lower", ch);
            } else if (!Character.isLetterOrDigit(ch)) {
                map.put("special", ch);
            }
        }

        if (map.containsKey("digit") && map.containsKey("upper") && map.containsKey("lower") && map.containsKey("special")) {
            return true;
        } else {
            return false;
        }
    }
}
