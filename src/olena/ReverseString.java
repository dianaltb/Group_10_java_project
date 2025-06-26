package olena;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("With string builder "+ reverseStrB("ABCD") );
        System.out.println("With loop "+reverseStr("ABCD"));

    }
    //REVERSE WITH STRING BUILDER
    public static String reverseStrB(String str){

        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();

    }

    //REVERSE WITH LOOP
    public static String reverseStr(String str) {
        String vedro = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            vedro += str.charAt(i);
        }
        return vedro;
    }
}
