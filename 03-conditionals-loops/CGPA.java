import java.util.Scanner;

class CGPA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Grade of Math: ");
        int mathGrade = sc.nextInt();

        System.out.print("Enter the Grade of Data Science: ");
        int dsGrade = sc.nextInt();

        System.out.print("Enter the Grade of OOPs: ");
        int oopsGrade = sc.nextInt();

        System.out.print("Enter the credit score of Math: ");
        int mathCredit = sc.nextInt();

        System.out.print("Enter the credit score of Data Science: ");
        int dsCredit = sc.nextInt();

        System.out.print("Enter the credit score of OOPs: ");
        int oopsCredit = sc.nextInt();

        double cgpa = (mathGrade * mathCredit + dsGrade * dsCredit + oopsGrade * oopsCredit) / (double) (mathCredit + dsCredit + oopsCredit);

        System.out.println("CGPA = " + cgpa);
        sc.close();
    }
}
