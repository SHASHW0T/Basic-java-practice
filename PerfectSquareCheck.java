import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        scanner.close();
    }

    public static boolean isPerfectSquare(long num) {
        if (num < 0) {
            return false;
        }

        long sqrt = (long) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
