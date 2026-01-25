import java.util.Scanner;

public class Distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter the value of X1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the value of Y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter the value of X2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the value of Y2: ");
        int y2 = sc.nextInt();

        //calculating distance
        int dy = (x2-x1);
        int dx = (y2-y1);

        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.println("Distance = "+ distance);
        sc.close();
    }
}
