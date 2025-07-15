package niloo;
/*
 Write a return method that can reverse String
         Ex: Reverse("ABCD"); ==> DCBA
     */
public class ReverseString {

    public static void main(String[] args) {
        
        reverse("ABCD");
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
    }

    public static String reverse(String str){
        
        String reversedString = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
          reversedString += str.charAt(i);
        }
        return reversedString;
    }

}
