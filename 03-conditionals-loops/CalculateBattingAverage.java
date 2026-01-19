import java.util.Scanner;

public class CalculateBattingAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();

        System.out.print("Enter total matches played: ");
        int matches = sc.nextInt();

        //calculating average
        double avg = runs / (double)matches;

        //Displaying output
        System.out.println("Batting average = " + avg);
        sc.close();
    }
}
