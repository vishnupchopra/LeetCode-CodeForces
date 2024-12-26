package problemSet2033B;

import java.util.Scanner;

public class SakurakoAndWater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for(int testCase=0; testCase<t; testCase++) {
			int n = scanner.nextInt();
			int[][] height = new int[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					height[i][j]=scanner.nextInt();
				}
			}
			int timesMagicUsed=0;
			//for lower triangular matrix;
			for(int i=0; i<n; i++) {
				int minimal=0;
				for(int j=i, k=0; j<n; j++, k++) {
					minimal=height[j][k]<minimal?height[j][k]:minimal;
				}
				timesMagicUsed-=minimal;
			}
			//for upper triangular matrix;
			for(int i=1; i<n; i++) {
				int minimal=0;
				for(int j=i, k=0; j<n; j++, k++) {
					minimal=height[k][j]<minimal?height[k][j]:minimal;
				}
				timesMagicUsed-=minimal;
			}

			res[testCase]=timesMagicUsed;
		}
		for(int i : res) System.out.println(i);
		scanner.close();
	}

}
