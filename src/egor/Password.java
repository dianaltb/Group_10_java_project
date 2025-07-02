package egor;

public class Password {
    public static void main(String[] args) {
        String pass = "asdB3!ggg";
        System.out.println(validation(pass) ? "Password is allowed!" : "Password is NOT allowed!");
        //Password is allowed!
    }

    private static boolean validation(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\w\\s])\\S{6,}$";
        return password.matches(regex);
    }
}
