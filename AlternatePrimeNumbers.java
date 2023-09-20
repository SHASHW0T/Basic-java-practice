public class AlternatePrimeNumbers {
    public static void main(String[] args) {
        int count = 0; // To keep track of the number of prime numbers found
        int number = 2; // Start with the first prime number

        while (count < 10) { // Change 10 to the desired number of prime numbers to display
            if (isPrime(number)) {
                if (count % 2 == 0) { // Display alternate prime numbers
                    System.out.print(number + " ");
                }
                count++;
            }
            number++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
