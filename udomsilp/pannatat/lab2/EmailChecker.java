package udomsilp.pannatat.lab2;

public class EmailChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Invalid number of arguments. Please provide exactly one argument");
        return; }
        String email = args[0].toLowerCase();
        if (email.endsWith("@kkumail.com")) {
            System.out.println(email + " is a KKU student email");
        }
        if (email.endsWith("@kku.ac.th")) {
            System.out.println(email + " is a KKU staff email");
        }
        else System.out.println("Your email is invalid");
    }
}
