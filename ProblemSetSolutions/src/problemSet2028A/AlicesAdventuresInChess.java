package problemSet2028A;

import java.util.Scanner;

public class AlicesAdventuresInChess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] otpt = new String[t];
        for (int i = 0; i < t; i++) {
            otpt[i] = "NO";
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String s = scanner.next();
            char[] cha = s.toCharArray();

            int aa = 0;
            int ab = 0;
            int j = 0;

            // Track Alice's position
            while((aa<=a)||(ab<=b)){
                switch (cha[j]) {
                    case 'N': ab++; break;
                    case 'S': ab--; break;
                    case 'E': aa++; break;
                    case 'W': aa--; break;
                    default: System.out.println("Invalid"); break;
                }
                j=(j<cha.length-1)?j+1:0;
                if (aa == a && ab == b) {
                    otpt[i] = "YES";
                    break;
                }
            }
        }
        for (String result : otpt) {
            System.out.println(result);
        }
        scanner.close();
    }
}