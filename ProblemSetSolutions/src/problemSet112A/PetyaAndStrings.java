package problemSet112A;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().trim();
        String s2 = scanner.nextLine().trim();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int result = s1.compareTo(s2);
        
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}