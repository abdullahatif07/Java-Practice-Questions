import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        int sum = 0;

        for(int i=1; i<=num; i++)
            sum += i;

        int avg = sum/num;

        System.out.println("Average = " + avg);
        sc.close();
    }
}
