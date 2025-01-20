import java.util.*;

// Create a class PalindromeValidator to check if a string is a palindrome
public class PalindromeValidator {
    // Variable to store the input text
    String inputText;

    // Constructor to initialize the input text
    PalindromeValidator(String inputText) {
        this.inputText = inputText;
    }

    // Method to check if the string is a palindrome
    public boolean checkIfPalindrome() {
        String reversedText = "";
        for (int i = inputText.length() - 1; i >= 0; i--) {
            reversedText += inputText.charAt(i);
        }

        return reversedText.equals(inputText);
    }

    // Method to display the result of the palindrome check
    public void showResult() {
        if (checkIfPalindrome()) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

// Create a class PalindromeTest to use the functionality of PalindromeValidator
// class
 class PalindromeTest {

    public static void main(String[] args) {
        // Create an object of the Scanner class
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string to check
        System.out.print("Enter a word to check if it's a palindrome: ");
        String userInput = scanner.next();

        // Create an object of PalindromeValidator class
        PalindromeValidator palindromeChecker = new PalindromeValidator(userInput);

        // Call the showResult method to display the check result
        palindromeChecker.showResult();

        scanner.close();
    }
}
