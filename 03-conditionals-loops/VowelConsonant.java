import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
        
        sc.close();
    }
}
