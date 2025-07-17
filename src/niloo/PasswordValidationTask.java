package niloo;
/*
write a return method that can verify if a password is valid or not.
requirements:
- password must be at least 6 characters and should not contain space.
- password should at least contain one uppercase letter.
- password should at least contain one lowercase letter.
- password should at least contain one special character.
- password should at least contain one digit.
if all the requirements are met, the method returns true. otherwise it returns false.
 */

public class PasswordValidationTask {

    public static void main(String[] args) {
      String password = "P@ssw0rd";
        System.out.println(password + " is valid password = " + isValid("P@ssw0rd"));

    }

    public static boolean isValid(String password){

     if (password == null || password.length() < 6 || password.contains(" ")) {
        return false;
    }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;


        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {hasUppercase = true;}
            else if (Character.isLowerCase(ch)) {hasLowercase = true;}
            else if (Character.isDigit(ch)) {hasDigit = true;}
            else {hasSpecialChar = true;}
        }
      return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;

    }

}
