import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double r = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();

        System.out.print("Enter time (in years): ");
        int t = sc.nextInt();

        // Convert percentage to decimal
        r = r / 100;

        // Compound Interest Formula
        double amount = p * Math.pow(1 + r / n, n * t);

        System.out.println("Final Amount = " + amount);
        sc.close();
    }
}
