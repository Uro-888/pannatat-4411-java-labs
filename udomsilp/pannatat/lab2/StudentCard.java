package udomsilp.pannatat.lab2;

public class StudentCard{
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println
            ("Error: Invalid number of arguments. Please provide exactly three arguments");
            return;}
        String name = args[0].toUpperCase();
        String studentID = args[1];
        Integer birthyear = Integer.parseInt(args[2]);
        final int CURRENT_YEAR = 2026;
        int age = CURRENT_YEAR - birthyear;
        System.out.println("Name : " + name);
        System.out.println("Student ID : " + studentID);
        System.out.println("Age in 2026 : " + age);
    }
}

