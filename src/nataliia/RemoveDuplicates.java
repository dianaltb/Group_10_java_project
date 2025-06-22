package nataliia;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String output = removeDup(input);

        System.out.println(output);
    }

    public static String removeDup(String str) {
        String result = " ";

        for (int i = 0; i < str.length(); i++) {  // Loop through each character in the input string
            char currentChar = str.charAt(i);

            if (result.indexOf(currentChar) == -1) { // Check if the character is not already in the result string
                result += currentChar;
            }
        }

        return result;

    }
}

/*
Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */