import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        //calculating ncr
        int ncr = factorial(n) / (factorial(r) * factorial(n-r));

        //calculating npr
        int npr = factorial(n) / factorial((n-r));

        //Displaying NCR and NPR
        System.out.println("NCR = " + ncr);
        System.out.println("NPR = " + npr);
        sc.close();
    }

    //Calculating factorial
    static int factorial(int n){
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }

        return fact;
    }
}
