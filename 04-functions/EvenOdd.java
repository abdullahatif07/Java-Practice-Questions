import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking number as input
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        //Calling function
        evenOdd(num);
        sc.close();
    }

    //Created a function to check whether a number is even or odd
    static void evenOdd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is even number!");
        }else {
            System.out.println(n + " is odd number!");
        }
    }
    
}
