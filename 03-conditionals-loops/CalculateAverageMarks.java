import java.util.Scanner;

class CalculateAverageMarks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking marks
        System.out.print("Enter the marks of first subject: ");
        int first = sc.nextInt();

        System.out.print("Enter the marks of second subject: ");
        int second = sc.nextInt();

        System.out.print("Enter the marks of third subject: ");
        int third = sc.nextInt();

        System.out.print("Enter the marks of fourth subject: ");
        int fourth = sc.nextInt();

        System.out.print("Enter the marks of fifth subject: ");
        int fifth = sc.nextInt();

        //Calculating Average
        int avg = (first + second + third + fourth + fifth) / 5;

        //Printing Average
        System.out.println("Average Marks = " + avg);

        sc.close();
    }
}
