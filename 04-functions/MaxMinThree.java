import java.util.Scanner;

public class MaxMinThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        //Calling function
        maxMin(num1, num2, num3);
        sc.close();
    }
    //Function for finding maximum and minimum of three number
    static void maxMin(int a, int b, int c){
        //For Maximum
        if(a >= b && a >= c)
            System.out.println("Maximum number: " + a);
        else if(b >= c && b >= a)
            System.out.println("Maximum number: " + b);
        else
            System.out.println("Maximum number: " + c);

        //For Minimum
        if(a <= b && a <= c)
            System.out.println("Minimum number: " + a);
        else if(b <= c && b <= a)
            System.out.println("Minimum number: " + b);
        else
            System.out.println("Minimum number: " + c);
    }
}
