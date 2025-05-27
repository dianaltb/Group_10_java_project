package nataliia;

public class FrequencyOfCharacters {

    /*
 Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

    public static String frequencyOfChars(String str) {

        StringBuilder result = new StringBuilder(); // To build the final result like "A3B2C1D2"
        String checked =""; // This will store characters that we've already counted

        for (int i =0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Getting the character at position "i"

            // Check if we've already counted this character
            if (checked.indexOf(currentChar) !=-1) {
                continue;
            }
            int count = 0; // place to store how many times currentChar appears

        // Count how many times currentChar appears in the whole string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++; // Increase the count if there's a match
                }
            }

            // "+" the character and its count to the result
            result.append(currentChar).append(count);

            // Mark this character as "checked" so we don't count it again
            checked += currentChar;
        }

        // Convert StringBuilder to string
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String output = frequencyOfChars(input);
        System.out.println("Character frequency: " + output);

    }
}

