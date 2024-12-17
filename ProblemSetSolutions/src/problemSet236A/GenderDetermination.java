package problemSet236A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GenderDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        
        Set<Character> distinctCharacters = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinctCharacters.add(c);
        }
        int distinctCount = distinctCharacters.size();
        if (distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        scanner.close();
    }
}