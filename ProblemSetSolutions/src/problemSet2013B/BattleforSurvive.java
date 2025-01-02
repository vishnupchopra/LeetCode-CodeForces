package problemSet2013B;

import java.util.Scanner;

public class BattleforSurvive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] res = new long[t];
		for(int testCase=0; testCase<t; testCase++) {
			int n = scanner.nextInt();
			long[] arrnmintwo = new long[n-2];
			for(int i=0; i<n-2; i++) {
				arrnmintwo[i] = scanner.nextInt();
			}
			long nmintwo = scanner.nextInt();
			long nminone = scanner.nextInt();
			for(int i=n-3;i>=0;i--) {
				nminone += arrnmintwo[i];
			}
			nminone -= nmintwo;
			res[testCase]=nminone;
		}
		for(long ele : res) {
			System.out.println(ele);
		}
		scanner.close();
	}

}
