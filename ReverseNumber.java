import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number = number / 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNumber);

        scanner.close();
    }
}
