import java.util.Scanner;

public class PrimeNumbersBeetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking inputs
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        //calling function
        primeNumber(num1, num2);

        sc.close();
    }

    //function for displaying prime numbers between two numbers
    static void primeNumber(int a, int b){
        for(int i=a+1; i<b; i++){
            if(isPrime(i))
                System.out.println(i + " ");
        }
    }

    //creating a function to check if a number is prime or not
    static boolean isPrime(int n){
        //checking edge cases
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;

        for(int i=2; i<=n/2; i++){
            if(n%i == 0)return false;
        }

        return true;
    }
}
