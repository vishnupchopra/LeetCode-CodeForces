package problemSet158A;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        int[] Scores = new int[n];
        for (int i = 0; i < n; i++) {
            Scores[i] = Integer.parseInt(scanner.next());
        }
        int NextRound = 0;
        for (int i = 0; i < n; i++) {
            if (Scores[i] >= Scores[k - 1] && Scores[i] > 0) {
                NextRound++;
            }
        }
        System.out.println(NextRound);
        scanner.close();
    }
}