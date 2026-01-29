import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost: ");
        int cost = sc.nextInt();

        System.out.print("Enter scrap value: ");
        int scrap = sc.nextInt();

        System.out.print("Enter life span: ");
        int life = sc.nextInt();

        double depreciation = (cost - scrap) / (double) (life);

        System.out.print("Depreaciation per year = " + depreciation);
        sc.close();
    }
}
