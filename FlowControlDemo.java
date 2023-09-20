import java.util.Scanner;
import java.util.Random;

public class FlowControlDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // i. Leap year or not
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Leap year? " + isLeapYear);

        // ii. Odd or even
        System.out.print("Enter a number to check if it's odd or even: ");
        int number = scanner.nextInt();
        String parity = (number % 2 == 0) ? "even" : "odd";
        System.out.println("Number is " + parity);

        // iii. Biggest of N numbers
        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int current = scanner.nextInt();
            if (current > largest) {
                largest = current;
            }
        }
        System.out.println("The largest number is: " + largest);

        // iv. Palindrome or not
        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = scanner.next();
        boolean isPalindrome = true;
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome? " + isPalindrome);

        // v. Factorial of a given number
        System.out.print("Enter a number to calculate its factorial: ");
        int factorialNumber = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= factorialNumber; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + factorialNumber + " is: " + factorial);

        // vi. Prime number or not
        System.out.print("Enter a number to check if it's prime: ");
        int primeNumber = scanner.nextInt();
        boolean isPrime = true;
        if (primeNumber <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
                if (primeNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Prime number? " + isPrime);

        // vii. Armstrong number
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int armstrongNumber = scanner.nextInt();
        int temp = armstrongNumber;
        int sum = 0;
        int numDigits = String.valueOf(armstrongNumber).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        boolean isArmstrong = (sum == armstrongNumber);
        System.out.println("Armstrong number? " + isArmstrong);

        // viii. Fibonacci series
        System.out.print("Enter the count of Fibonacci numbers to generate: ");
        int fibCount = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second + " ");
        for (int i = 2; i < fibCount; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();

        // ix. Student grade calculation
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Student grade: " + grade);

        // x. Display multiplication table
        System.out.print("Enter a number to display its multiplication table: ");
        int multiplicationTableNumber = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicationTableNumber + " x " + i + " = " + (multiplicationTableNumber * i));
        }

        // xi. Generate random number
        int randomNum = random.nextInt(100); // Generates a random number between 0 and 99
        System.out.println("Random Number: " + randomNum);

        scanner.close();
    }
}