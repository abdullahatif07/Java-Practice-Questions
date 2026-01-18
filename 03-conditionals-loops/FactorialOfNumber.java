import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        int factorial = 1;

        for(int i=1; i<=num; i++)
            factorial *= i;

        System.out.println("Factorial = " + factorial);
        sc.close();
    }
}
