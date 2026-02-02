import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        //calling function and storing ans
        boolean ans = isPrime(num);
        if(ans) System.out.println(num + " is a Prime number!");
        else System.out.println(num + " is not a Prime number!");

        sc.close();
    }

    //creating a function which returns whether the given number is Prime or Not
    static boolean isPrime(int num){
        if(num == 2) return true;
        if(num == 1 || num == 0) return false;

        for(int i=2; i<=num/2; i++){
            if(num % i == 0)return false;
        }

        return true;
    }
}
