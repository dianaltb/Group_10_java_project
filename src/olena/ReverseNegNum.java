package olena;

public class ReverseNegNum {
    public static void main(String[] args) {
        System.out.println(numberRev1(-125));
        System.out.println(numberRev2(-125));

    }

    // FIRST METHOD W/FORI LOOP
    public  static int numberRev1(int number) {

        String newNum = "" + number;
        String bucket = "";

        for (int i = newNum.length() - 1; i > 0; i--) {
            bucket += newNum.charAt(i);
        }
        return  -(Integer.parseInt(bucket));
    }

   // SECOND METHOD W/STRING BUILDER
    public static int numberRev2(int num){

        String temp = String.valueOf(num).substring(1);

        StringBuilder builder = new StringBuilder(temp);
        return -(Integer.valueOf(builder.reverse().toString()));

    }
}
