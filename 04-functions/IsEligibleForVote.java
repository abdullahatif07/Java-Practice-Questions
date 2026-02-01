import java.util.Scanner;

public class IsEligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking age as input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        //calling function
        isEligible(age);
        sc.close();
    }

    //Created a function to check whether he/she is eligible to vote or not
    static void isEligible(int age){
        if(age >= 18)
            System.out.println("Yes you are eligible to vote");
        else
            System.out.println("No you are not eligible to vote!");
    }
}
