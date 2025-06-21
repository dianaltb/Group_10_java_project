package roman;

public class StringUniqChars {

    public static void main(String[] args) {
        System.out.println(uniqChars("aaBBBcMMr7789@@#"));
    }

    //method below will take string parametr and will return uniq chars
    public static String uniqChars(String str){

        String st = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                st += str.charAt(i);
            }
        }

        return st;
    }

}
