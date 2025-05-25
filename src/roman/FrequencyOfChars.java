package roman;

public class FrequencyOfChars {
    /*
          Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */



    //method below will accept string as a parameter and will return string with each char counted and concataneted to new string
    public static String frequency_of_chars(String str){

        String temp = "";


        for (int i = 0; i < str.length(); i++){
            int cont = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    cont++;
                }
            }

            if (!temp.contains(str.charAt(i) + "")) {
                temp += "" + str.charAt(i) + cont;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(frequency_of_chars("AAABBCDD"));
    }

}
