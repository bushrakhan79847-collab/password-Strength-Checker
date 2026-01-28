import java.util.*;

public class Main{

    public static void main(String[] args) {

        // Sample passwords to test
        List<String> testPasswords = Arrays.asList(
                "abc",
                "123456",
                "Pass@123",
                "Admin"
        );

        System.out.println("Password Strength Report\n");

        // Checking each password one by one
        for (String password : testPasswords) {
            if (isStrongPassword(password)) {
                System.out.println(password + "  =>  Strong Password ");
            } else {
                System.out.println(password + "  =>  Weak Password ");
            }
        }
    }

    // This method checks whether password follows all rules
    public static boolean isStrongPassword(String password) {

        // Rule 1: Minimum length should be 8
        boolean validLength = password.length() >= 8;

        // Rule 2: Must contain at least one digit
        boolean hasDigit = password.matches(".*\\d.*");

        // Rule 3: Must contain at least one special character
        boolean hasSpecialSymbol = password.matches(".*[!@#$%^&*()].*");

        // Final decision
        return validLength && hasDigit && hasSpecialSymbol;
    }
}
