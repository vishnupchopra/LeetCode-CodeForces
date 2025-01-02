package problemSet2026A;

import java.util.Scanner;

public class PerpendicularSegments {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = 2*scanner.nextInt();
		int[][] res = new int[t][4];
		int testCase=0;
		while(testCase<t) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			int k=scanner.nextInt();
			int smallest=x<=y?x:y;
			int ax=0;
			int bx=smallest;
			int ay=smallest;
			int by=0;
			res[testCase][0]=ax;
			res[testCase][1]=ay;
			res[testCase][2]=bx;
			res[testCase][3]=by;
			testCase++;
			res[testCase][0]=0;
			res[testCase][1]=0;
			res[testCase][2]=smallest;
			res[testCase][3]=smallest;
			testCase++;
		}
		for(int[] inner : res) {
			for(int i : inner) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		scanner.close();
	}

}
