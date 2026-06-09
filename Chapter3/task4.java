package Chapter3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use StringBuilder to reverse the input string
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        // Use equals() to compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
}