import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the electicity you used: ");
        int unit = sc.nextInt();

        int perUnitCost = 3;//per unit cost is 3 rupees
        int electricityBill = unit * perUnitCost;

        System.out.println("Total Electicity Bill: " + electricityBill);
        sc.close();
    }
}
