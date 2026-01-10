import java.util.Scanner;

public class PalindromeStr{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        String input = sc.next().trim();

        if (input.startsWith("-")) {
            System.out.println(input + " is not a Palindrome");
            return;
        }
        if (input.startsWith("+")) {
            input = input.substring(1); 
        }

        if (!input.matches("\\d+")) {
            System.out.println("Invalid input");
            return;
        }

        // This regex removes leading zeros unless the string is just "0".
        String numberToCheck = input.replaceFirst("^0+(?!$)", "");

        if (isPalindrome(numberToCheck)) {
            System.out.println(numberToCheck + " is a Palindrome");
        } else {
            System.out.println(numberToCheck + " is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
