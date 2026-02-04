import java.util.Scanner;

public class FirstNaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        //calling function and storing the answer into a variblee
        int ans = sumOfNatural(num);

        System.out.println("Sum of first " + num + " is: " + ans);
        sc.close();
    }

    //creating a function to calculate sum of First N Natural Number
    static int sumOfNatural(int n){
        int sum = 0;

        for(int i=1; i<=n; i++)
            sum += i;

        return sum;
    }
}
