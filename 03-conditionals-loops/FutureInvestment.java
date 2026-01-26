import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking inputs
        System.out.print("Enter Present value (initial investment): ");
        int p = sc.nextInt();

        System.out.print("Enter Rate of return per period: ");
        double r = sc.nextDouble() / 100;

        System.out.print("Enter the Number of periods: ");
        int n = sc.nextInt();

        //Calculating Answer
        double ans = p * Math.pow(1+r, n);

        System.out.println("Future investment value = " + ans);
        sc.close();
    }
}
