package roman;

public class ReverseNegativeNumber {


    //this method will accept int negative number only,
    //and will return it negative in reverse order,
    //if number provided parameter is more than -1 it will print error msg
    public static int reverseNegativeNum (int num){

        String stringNumber = "" + num;
        String reversedStringNumber = "-";

        for (int i = stringNumber.replace("-","").length(); i > 0; i--) {
            reversedStringNumber += stringNumber.charAt(i);
        }


        if (num > -1){
            System.err.println("Number must be negative");
            System.exit(0);

        }
        return Integer.parseInt(reversedStringNumber);

    }


    public static void main(String[] args) {

        //testing method above
        System.out.println(reverseNegativeNum(-3));

    }
}
