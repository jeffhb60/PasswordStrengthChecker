# Password Strength Checker

A simple Java program to check the strength of a password based on several criteria, such as length, presence of uppercase and lowercase letters, digits, and special characters. The program provides a strength rating ranging from "Very Weak" to "Very Strong".

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Strength Criteria](#strength-criteria)
- [Contributing](#contributing)
- [License](#license)

## Features
- Checks the strength of a password based on multiple criteria.
- Provides a rating for the password strength: "Very Weak", "Weak", "Medium", "Strong", or "Very Strong".
- Easy to use command-line interface.
  
## Installation
To run this program, you need to have Java Development Kit (JDK) installed on your system.

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/password-strength-checker.git
2. **Navigate to the project directory**:
   ```bash
   cd password-strength-checker
3. **Compile the Java program**:
   ```bash
    javac PasswordStrengthChecker.java
## Usage
1. **Run the compiled program**:
   ```bash
   java PasswordStrengthChecker
2. **Enter a password** when prompted:
    ```css
    Enter a password to check its strength:
3. **View the strength rating** of your password.

## Strength Criteria
The strength of the password is evaluated based on the following criteria:
1. **Length**: The password must be at least 8 characters long.
2. **Uppercase Letters**: The password must contain at least one uppercase letter (A-Z).
3. **Lowercase Letters**: The password must contain at least one lowercase letter (a-z).
4. **Digits**: The password must contain at least one digit (0-9).
5. **Special Characters**: The password must contain at least one special character (e.g., `!@#$%^&*(),.?":{}|<>`).

The program assigns a score based on how many criteria the password meets and provides a corresponding strength rating:
* **Very Weak**: Meets 0 or 1 criteria
* **Weak**: Meets 2 criteria
* **Medium**: Meets 3 criteria
* **Strong**: Meets 4 criteria
* **Very Strong**: Meets all 5 criteria

## Contributing
Contributions are welcome! If you'd like to contribute, please fork the repository and make changes as you'd like. Pull requests are warmly welcome.
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-branch-name`.
3. Make your changes and commit them: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature-branch-name`.
5. Submit a pull request.
   
## Contact
For any inquiries or suggestions, please contact jeffhb60@gmail.com.  

