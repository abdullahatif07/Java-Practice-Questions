import java.util.Scanner;

class CommissionPercentage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of sale: ");
        int amount = sc.nextInt();

        System.out.print("Enter the amount of commission: ");
        int commission = sc.nextInt();

        double ans = (commission / (double) amount) * 100;

        System.out.println("Commission Percentage: " + ans);
        sc.close();
    }
}
