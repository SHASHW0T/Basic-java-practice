import java.util.Scanner;
public class Pallendrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your no: ");
        int a = scanner.nextInt();

        scanner.close();

        int r, sum = 0, temp;

        temp = a;
        while(a>0){
            r = a%10;
            sum = (sum*10) + r;
            a = a/10;
        }
        if (temp==sum)
            System.out.println("It is pallendrome");
        else
            System.out.println("It is not pallendrome");
    }
}
