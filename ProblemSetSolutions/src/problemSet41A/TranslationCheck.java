package problemSet41A;
import java.util.Scanner;

public class TranslationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input words
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        // Reverse the word s
        String reversedS = new StringBuilder(s).reverse().toString();
        
        // Check if reversedS is equal to t
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}