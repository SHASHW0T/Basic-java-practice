import java.util.Scanner;

public class NumberToWord {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0-9999): ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 9999) {
            String words = convertNumberToWords(number);
            System.out.println("Number in words: " + words);
        } else {
            System.out.println("Number out of range.");
        }

        scanner.close();
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0) {
            return "Negative " + convertNumberToWords(-number);
        }

        String result = "";

        if (number >= 1000) {
            result += convertNumberToWords(number / 1000) + " Thousand ";
            number %= 1000;
        }

        if (number >= 100) {
            result += units[number / 100] + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 10) {
                result += units[number];
            } else if (number < 20) {
                result += teens[number - 10];
            } else {
                result += tens[number / 10] + " " + units[number % 10];
            }
        }

        return result.trim();
    }
}
