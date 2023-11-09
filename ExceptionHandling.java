public class ExceptionHandling {

    public static void main(String[] args) {
        // ArithmeticException: occurs when an integer is divided by zero
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // this will throw an ArithmeticException
            System.out.println("The result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            e.printStackTrace(); // prints the stack trace of the exception
        }

        // ArrayIndexOutOfBoundsException: occurs when an array index is out of range
        try {
            int[] arr = {1, 2, 3};
            int x = arr[3]; // this will throw an ArrayIndexOutOfBoundsException
            System.out.println("The element at index 3 is " + x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
            e.printStackTrace();
        }

        // NullPointerException: occurs when an object reference is null
        try {
            String s = null;
            int len = s.length(); // this will throw a NullPointerException
            System.out.println("The length of the string is " + len);
        } catch (NullPointerException e) {
            System.out.println("The string is null");
            e.printStackTrace();
        }

        // NumberFormatException: occurs when a string cannot be parsed into a number
        try {
            String s = "abc";
            int n = Integer.parseInt(s); // this will throw a NumberFormatException
            System.out.println("The number is " + n);
        } catch (NumberFormatException e) {
            System.out.println("The string is not a valid number");
            e.printStackTrace();
        }
    }
}
