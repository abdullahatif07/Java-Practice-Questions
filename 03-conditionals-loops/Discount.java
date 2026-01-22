import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter the price of the product: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter the percentage of discount: ");
        int percentage = sc.nextInt();
        
        //Calculating the discount money
        double discount = (originalPrice * percentage) / 100.0;
        //Calculating final price
        double finalPrice = originalPrice - discount;

        //Displaying Final Price of the product
        System.out.println("Price after the discount = " + finalPrice);
        sc.close();
    }
}
