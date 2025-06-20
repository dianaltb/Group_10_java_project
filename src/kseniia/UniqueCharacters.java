package kseniia;
/*
      Write a return  method that can find the unique characters from the String
         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"

 */
public class UniqueCharacters {

    public static String unique(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }
}
