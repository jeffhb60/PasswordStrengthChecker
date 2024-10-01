
import java.util.Scanner;

public class PasswordStrengthChecker {

    public static String checkPasswordStrength(String password) {
        int strengthScore = 0;

        // Criteria 1: Password length
        if (password.length() >= 8) {
            strengthScore++;
        }

        // Criteria 2: At least one uppercase letter
        if (password.matches(".*[A-Z].*")) {
            strengthScore++;
        }

        // Criteria 3: At least one lowercase letter
        if (password.matches(".*[a-z].*")) {
            strengthScore++;
        }

        // Criteria 4: At least one digit
        if (password.matches(".*\\d.*")) {
            strengthScore++;
        }

        // Criteria 5: At least one special character
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            strengthScore++;
        }

        // Determine the strength based on the score
        return switch (strengthScore) {
            case 5 -> "Very Strong";
            case 4 -> "Strong";
            case 3 -> "Medium";
            case 2 -> "Weak";
            default -> "Very Weak";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password to check its strength:");
        String password = scanner.nextLine();

        String strength = checkPasswordStrength(password);
        System.out.println("Password Strength: " + strength);

        scanner.close();
    }
}
