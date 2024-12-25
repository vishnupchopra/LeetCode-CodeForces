package problemSet2048B;

import java.util.Arrays;
import java.util.Scanner;

public class KevinAndPermutations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		int[][] output = new int[t][];
		for(int testCase=0; testCase<t; testCase++) {
			int n = Integer.parseInt(scanner.next());
			int k = Integer.parseInt(scanner.next());
			
			int baseNum = 1;
			int[] innerOutput = new int[n];
			Arrays.fill(innerOutput, 0);
			for(int i=k-1; i<n; i=i+k) {
				innerOutput[i]=baseNum;
				++baseNum;
			}
			for(int i=0; i<n; i++) {
				if(innerOutput[i]==0) {
					innerOutput[i]=baseNum;
					baseNum++;
				}
			}
			output[testCase] = innerOutput;
		}
		for(int[] i : output) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		scanner.close();
	}

}
