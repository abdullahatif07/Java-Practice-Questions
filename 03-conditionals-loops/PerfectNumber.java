import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        //calculating divisor Sum
        int divisorSum = 0;
        for(int i=1; i<=num/2; i++){
            if(num % i == 0) divisorSum += i;
        }

        //Displaying the result
        if(divisorSum == num){
            System.out.println(num + " is a Perfect Number!");
        }else{
            System.out.println(num + " is not a Perfect Number");
        }

        sc.close();
    }
}
