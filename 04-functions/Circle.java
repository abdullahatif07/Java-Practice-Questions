import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter radius: ");
        int rad = sc.nextInt();

        //calling the function
        circumferenceAreaOfCircle(rad);

        sc.close();
    }

    //creating a function which gives us area and circumference of circle
    static void circumferenceAreaOfCircle(int r){
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Circumeference = " + circumference);
    }
}
