package problemSet4A;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		System.out.println(w%2==0?w>2?"YES":"NO":"NO");
		scanner.close();
	}

}