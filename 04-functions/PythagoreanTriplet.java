import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        //Calling the function and storing the answer
        boolean ans = isPythagorean(num1, num2, num3);

        //Displaying the answer according to the answer
        if(ans)System.out.println("It is a Pythagorean triplet!");
        else System.out.println("It is not a Pythagorean triplet!");

        sc.close();
    }

    //Creating the function to check whether it is a pythagorean triplet or not
    static boolean isPythagorean(int a, int b, int c){
        int first = a*a, second = b*b, third = c*c;
        boolean ans = false;
        
        if((first+second) == third) ans = true;
        else if((second+third) == first)  ans = true;
        else if((first+third) == second) ans = true;
       
        return ans;
    }

}
