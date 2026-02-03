import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //taking input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        //calling factorial fuction
        factorial(num);

        sc.close();
    }

    //creating a function for calculating and printing the factorial of a number
    static void factorial(int n){
        int fact = 1;

        for(int i=2; i<=n; i++)
            fact *= i;

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
