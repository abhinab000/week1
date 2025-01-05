package week4;

import java.util.Scanner;
import java.util.Set;

public class StringManipulator {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }

    public int countVowels(String input) {
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (char c : input.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the String Manipulator!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Count Vowels");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to reverse: ");
                    String inputReverse = scanner.nextLine();
                    System.out.println("Reversed String: " + manipulator.reverse(inputReverse));
                    break;
                case 2:
                    System.out.print("Enter a string to convert to uppercase: ");
                    String inputUpper = scanner.nextLine();
                    System.out.println("Uppercase String: " + manipulator.toUpperCase(inputUpper));
                    break;
                case 3:
                    System.out.print("Enter a string to check for palindrome: ");
                    String inputPalindrome = scanner.nextLine();
                    if (manipulator.isPalindrome(inputPalindrome)) {
                        System.out.println("The string \"" + inputPalindrome + "\" is a palindrome.");
                    } else {
                        System.out.println("The string \"" + inputPalindrome + "\" is not a palindrome.");
                    }
                    break;
                case 4:
                    System.out.print("Enter a string to count vowels: ");
                    String inputVowels = scanner.nextLine();
                    int vowelCount = manipulator.countVowels(inputVowels);
                    System.out.println("Number of vowels in \"" + inputVowels + "\": " + vowelCount);
                    break;
                case 5:
                    System.out.println("Exiting the String Manipulator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
