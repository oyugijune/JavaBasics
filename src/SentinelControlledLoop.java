import java.util.Scanner;

public class SentinelControlledLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit");
        int number = input.nextInt();

        int sum = 0;
        while (number != 0) {
            System.out.println("Enter a digit (if you enter 0 the programme will terminate ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);

    }
}
