import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negativeSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter number (0 to stop): ");
        int num = sc.nextInt();

        while (num != 0) {
            if (num < 0) {
                negativeSum += num;
            } else if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();
        }

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + evenSum);
        System.out.println("Sum of positive odd numbers: " + oddSum);

        sc.close();
    }
}
