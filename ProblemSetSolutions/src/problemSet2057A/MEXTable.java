package problemSet2057A;

import java.util.Scanner;

public class MEXTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		int index = 0;
		while(t-->0) {
			int max = Integer.MIN_VALUE;
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			max = n>m?n:m;
			res[index] = max+1;
			++index;
		}
		for(int i : res) System.out.println(i);
		scanner.close();
	}

}
