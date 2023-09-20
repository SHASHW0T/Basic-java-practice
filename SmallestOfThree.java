import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double smallest = findSmallest(num1, num2, num3);

        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }

    public static double findSmallest(double a, double b, double c) {
        return (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    }
}
