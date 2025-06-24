package rasha;

public class ReverseTheString {

    //     Write a return method that can reverse  String
    //         Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        String str = "ABCD";

        System.out.println(reverseString(str));


    }

    public static String reverseString(String str) {

        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            temp+=str.charAt(i);
        }
        return temp;
    }
}
