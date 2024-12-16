package problemSet263A;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = 0, col = 0;

        // Read the matrix and find the position of '1'
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        // Calculate the number of moves to bring '1' to the center
        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(moves);
        scanner.close();
    }
}