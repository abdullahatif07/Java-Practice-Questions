import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        //stroring answer
        boolean ans = checkArmstrong(num);
        
        if(ans)
            System.out.println(num + " is a armstrong number");
        else
            System.out.println(num + " is not a armstrong number");

        sc.close();
    }

    //to check if a number is armstrong number or not
    static boolean checkArmstrong(int n){
        int originalNum = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n /= 10;
        }

        return sum == originalNum;
    }

}
