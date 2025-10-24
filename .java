import java.util.Scanner; // Import Scanner class to take input from the user

public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        int rev = 0, temp; // rev will store the reversed number, temp will store the original number

        System.out.println("Enter the Number:"); // Prompt user for input
        int num = sc.nextInt(); // Read the integer input from the user

        temp = num; // Store the original number in temp for later comparison

        // Reverse the given number
        while(num > 0)
        {
            int rem = num % 10;     // Extract the last digit
            rev = rev * 10 + rem;   // Append the digit to the reversed number
            num = num / 10;         // Remove the last digit from the original number
        }

        // Check if the original number and the reversed number are the same
        if(temp == rev)
        {
            System.out.println(temp + " is a Palindrome"); // If equal, it's a palindrome
        }
        else
        {
            System.out.println(temp + " is not a Palindrome"); // Otherwise, it's not
        }
    }
}
