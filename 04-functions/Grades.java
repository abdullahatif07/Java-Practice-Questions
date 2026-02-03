import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter your marks(out of 100): ");
        int marks = sc.nextInt();

        //calling displayGrades function for displaying the grades
        displayGrades(marks);
        sc.close();
    }

    static void displayGrades(int n){
        if(n >= 91 && n <= 100) System.out.println("Grade = AA");
        else if(n >= 81 && n <= 90) System.out.println("Grade = AB");
        else if(n >= 71 && n <= 80) System.out.println("Grade = BB");
        else if(n >= 61 && n <= 70) System.out.println("Grade = BC");
        else if(n >= 51 && n <= 60) System.out.println("Grade = CD");
        else if(n >= 41 && n <= 50) System.out.println("Grade = DD");
        else System.out.println("Grade: Fail");
    }
}
