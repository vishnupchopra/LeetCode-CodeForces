package problemSet546A;
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        
        // Calculate the total cost of bananas
        int totalCost = k * w * (w + 1) / 2;
        
        // Calculate the amount to borrow
        int amountToBorrow = Math.max(0, totalCost - n);
        
        // Output the result
        System.out.println(amountToBorrow);
        
        scanner.close();
    }
}
