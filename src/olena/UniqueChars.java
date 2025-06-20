package olena;
public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
    }


    public static String uniqueCharacters (String word) {
        StringBuilder builder = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (word.indexOf(c)== word.lastIndexOf(c) ) {
                builder.append(c);
            }
        }
        return builder.toString();
    }}

