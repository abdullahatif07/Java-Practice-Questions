import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int product = multiply(num1, num2);

        System.out.println(num1 + " * " + num2 + " = " + product);
        sc.close();
    }

    // Returns product of two numbers
    static int multiply(int a, int b) {
        return a * b;
    }
}
