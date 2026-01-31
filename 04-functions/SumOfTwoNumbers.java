import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        printSum(num1, num2);
        sc.close();
    }

    // Prints sum of two numbers
    static void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
