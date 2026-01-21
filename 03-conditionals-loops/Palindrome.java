import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        boolean ans = isPalindrome(num);

        if(ans)
            System.out.println(num + " is a palindrome number!");
        else
            System.out.println(num + " is not palindrome number!");

        sc.close();
    }

    static boolean isPalindrome(int num){
        int originalNum = num;
        int reverseNum = 0;

        while(num > 0){
            int rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num /= 10;
        }

        return originalNum == reverseNum;
    }
}
