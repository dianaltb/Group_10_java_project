package egor;

public class ReverseTheString {
    public static void main(String[] args) {
        System.out.println("With StringBuilder: " + reverseBuilder("ABCD"));
        System.out.println("With loop: " + reverseLoop("ADCD"));
        /*
        With StringBuilder: DCBA
        With loop: DCDA
         */
    }

    private static String reverseBuilder(String str){
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    private static String reverseLoop(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
