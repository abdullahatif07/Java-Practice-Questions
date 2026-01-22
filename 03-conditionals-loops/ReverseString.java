import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking string as input
        System.out.print("Enter the string: ");
        String str = sc.next();

        //Reversing String
        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }

        //Displaying Reverse String
        System.out.println("Reverse String = " + reverseStr);
        sc.close();
    }
}
