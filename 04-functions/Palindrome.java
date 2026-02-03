import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(isPalindrome(num))
            System.out.println(num + " is a Palindrome number!");
        else
            System.out.println(num + " is not a Palindrome number!");
        
        sc.close();
    }

    static boolean isPalindrome(int n){
        int originalNum = n, reverseNum = 0;

        while(n > 0){
            int rem = n % 10;
            reverseNum = reverseNum * 10 + rem;
            n /= 10;
        }

        return reverseNum == originalNum;
    }
}
