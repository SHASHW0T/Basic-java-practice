import java.util.Scanner;

class BankAccount {
    int accno;
    String name;
    int age;
    char gender;

    public BankAccount(int accno, String name, int age, char gender) {
        this.accno = accno;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class AccountType extends BankAccount {
    String acctype;

    public AccountType(int accno, String name, int age, char gender, String acctype) {
        super(accno, name, age, gender);
        this.acctype = acctype;
    }
}

class AccountBalance extends AccountType {
    double balance;
    double annualInterestRate;

    public AccountBalance(int accno, String name, int age, char gender, String acctype, double balance, double annualInterestRate) {
        super(accno, name, age, gender, acctype);
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    void calculateAnnualInterest() {
        double interest = balance * (annualInterestRate / 100);
        balance += interest;
        System.out.println("Annual interest added. New balance: $" + balance);
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Account Type: " + acctype);
        System.out.println("Balance: $" + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
    }
}

public class BankDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Gender (M/F): ");
        char gender = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Enter Account Type: ");
        String acctype = scanner.nextLine();
        System.out.print("Enter Initial Balance: $");
        double balance = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();

        AccountBalance account = new AccountBalance(accno, name, age, gender, acctype, balance, annualInterestRate);

        System.out.println("Account Details:");
        account.displayAccountInfo();

        while (true) {
            System.out.println("\nSelect an option:\n1. Withdraw\n2. Deposit\n3. Calculate Annual Interest\n4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    account.calculateAnnualInterest();
                    break;
                case 4:
                    System.out.println("Thank you for using our service. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
