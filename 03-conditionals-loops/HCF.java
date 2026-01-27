import java.util.Scanner;

public class HCF {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        //calculating hcf
        int ans = 1;
        for(int i=1; i<=Math.min(num1, num2); i++){
            if(num1%i == 0 && num2%i == 0){
                ans = i;
            }
        }

        System.out.println("HCF = " + ans);
        sc.close();
    }
}
