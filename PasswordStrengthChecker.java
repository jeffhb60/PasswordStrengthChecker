import java.util.regex.Matcher;  // Importing Matcher class for regex operations
import java.util.regex.Pattern;  // Importing Pattern class for regex operations
import java.util.Scanner;        // Importing Scanner class for taking user input

public class PasswordStrengthChecker {

    /**
     * This method checks the strength of the password based on several criteria.
     * 
     * @param password The password string to be evaluated.
     * @return A string indicating the strength of the password ("Very Weak", "Weak", "Medium", "Strong", "Very Strong").
     */
    public static String checkPasswordStrength(String password) {
        int strengthScore = 0;  // Variable to keep track of password strength score
        
        // Criteria 1: Password length should be at least 8 characters
        if (password.length() >= 8) {
            strengthScore++;  // Increment score if the condition is met
        }
        
        // Criteria 2: At least one uppercase letter is present in the password
        if (password.matches(".*[A-Z].*")) {
            strengthScore++;  // Increment score if the condition is met
        }

        // Criteria 3: At least one lowercase letter is present in the password
        if (password.matches(".*[a-z].*")) {
            strengthScore++;  // Increment score if the condition is met
        }

        // Criteria 4: At least one digit is present in the password
        if (password.matches(".*\\d.*")) {
            strengthScore++;  // Increment score if the condition is met
        }

        // Criteria 5: At least one special character is present in the password
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            strengthScore++;  // Increment score if the condition is met
        }

        // Determine the password strength based on the score
        switch (strengthScore) {
            case 5:
                return "Very Strong";  // All conditions are met
            case 4:
                return "Strong";       // Four conditions are met
            case 3:
                return "Medium";       // Three conditions are met
            case 2:
                return "Weak";         // Two conditions are met
            default:
                return "Very Weak";    // One or no conditions are met
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to take user input from the console
        
        System.out.println("Enter a password to check its strength:");  // Prompt user for input
        String password = scanner.nextLine();  // Read the input password from the user
        
        String strength = checkPasswordStrength(password);  //
