package rasha;

public class RemoveDuplicates {

    /*
    Remove Duplicates
    Write a return method that can remove the duplicated values from String
    Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String word){

        String[] arrayStr =  word.split("");
        String temp = "";

        for (String eachChar : arrayStr) {
            if(!temp.contains(eachChar)) {
                temp += eachChar;
            }
        }

        return temp;
    }

}
