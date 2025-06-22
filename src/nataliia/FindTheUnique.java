package nataliia;

public class FindTheUnique {

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String output = unique(input);

        System.out.println(output);
    }

    public static String unique(String str) {
        String result = " ";

        for (int i = 0; i < str.length(); i++) { // Loop through each character in the input string
            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) { // Check if this character appears only once in the entire string
                result += currentChar;
            }
        }

        return result;
    }
}



/*
 Write a return  method that can find the unique characters from the String
         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"
 */