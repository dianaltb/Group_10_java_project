package diana;

public class UniqueChars {

    public static void main(String[] args) {
        System.out.println("uniqueChars(\"HOHUGYFTYYTDTDHDHDGHD\") = " + uniqueChars("HOHUGYFTYYTDTDHDHDGHD"));
    }


    public static String uniqueChars(String word) {
        StringBuilder builder = new StringBuilder();

        for (char each : word.toCharArray()) {
            if (word.indexOf(each) == word.lastIndexOf(each)) {
                builder.append(each);
            }
        }
        return builder.toString();
    }
}
