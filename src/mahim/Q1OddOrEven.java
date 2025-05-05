package mahim;

public class Q1OddOrEven {


        public static void identify(int number) {
            if(number %2==0){
                System.out.println(number + " is " + "even");
            }else{
                System.out.println(number + " is " + "odd");
            }}


        public static String identifyTernary(int num ){
            return (num%2==0)?  "even" :"odd";
        }

        public static void main(String[] args) {
            identify(5);
            identify(6);
            identify(0);
            identify(-8);

            System.out.println("=============");

            System.out.println(identifyTernary(5));
            System.out.println(identifyTernary(6));
            System.out.println(identifyTernary(-988));

    }
}
