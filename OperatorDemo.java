import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arithmetic operators
        System.out.print("Enter two numbers for arithmetic operations: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));
        System.out.println("Division (/): " + (num1 / num2));
        System.out.println("Modulus (%): " + (num1 % num2));

        // Assignment operators
        System.out.print("Enter a number for assignment operations: ");
        int value = scanner.nextInt();
        value += 5;
        System.out.println("Assignment (+= 5): " + value);

        // Relational operators
        System.out.print("Enter two numbers for relational operations: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Equal to (==): " + (a == b));
        System.out.println("Not equal to (!=): " + (a != b));
        System.out.println("Greater than (>): " + (a > b));
        System.out.println("Less than (<): " + (a < b));
        System.out.println("Greater than or equal to (>=): " + (a >= b));
        System.out.println("Less than or equal to (<=): " + (a <= b));

        // Logical operators
        System.out.print("Enter two boolean values for logical operations (true/false): ");
        boolean bool1 = scanner.nextBoolean();
        boolean bool2 = scanner.nextBoolean();

        System.out.println("Logical AND (&&): " + (bool1 && bool2));
        System.out.println("Logical OR (||): " + (bool1 || bool2));
        System.out.println("Logical NOT (!) for bool1: " + (!bool1));
        System.out.println("Logical NOT (!) for bool2: " + (!bool2));

        // Unary operators
        System.out.print("Enter a number for unary operations: ");
        int unaryValue = scanner.nextInt();
        System.out.println("Unary Plus (+): " + (+unaryValue));
        System.out.println("Unary Minus (-): " + (-unaryValue));
        System.out.println("Prefix Increment (++): " + (++unaryValue));
        System.out.println("Prefix Decrement (--): " + (--unaryValue));

        // Bitwise operators
        System.out.print("Enter two integers for bitwise operations: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Bitwise AND (&): " + (x & y));
        System.out.println("Bitwise OR (|): " + (x | y));
        System.out.println("Bitwise XOR (^): " + (x ^ y));
        System.out.println("Bitwise Complement (~) for x: " + (~x));
        System.out.println("Bitwise Left Shift (<<) for x: " + (x << 1));
        System.out.println("Bitwise Right Shift (>>) for x: " + (x >> 1));

        scanner.close();
    }
}
