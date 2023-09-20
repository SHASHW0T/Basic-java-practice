import java.util.Scanner;

public class SquareRootWithoutSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
        } else {
            double epsilon = 1e-15; // Small value for precision
            double guess = number; // Initial guess for square root

            while (Math.abs(guess * guess - number) > epsilon) {
                // Newton-Raphson formula to approximate square root
                guess = (guess + number / guess) / 2.0;
            }

            System.out.println("Square root: " + guess);
        }

        scanner.close();
    }
}
