import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the power value: ");
        int p = sc.nextInt();

        long result = 1;
        for (int i = 0; i < p; i++) {
            result *= num;
        }

        System.out.println("Answer = " + result);
        sc.close();
    }
}
