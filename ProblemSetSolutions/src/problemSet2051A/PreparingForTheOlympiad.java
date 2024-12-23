package problemSet2051A;

import java.util.Scanner;

public class PreparingForTheOlympiad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		int[] output = new int[t];
		
		for(int testCase=0; testCase<t; testCase++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n+1];
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(scanner.next());
			}
			for(int i=0; i<n; i++) {
				b[i] = Integer.parseInt(scanner.next());
			}
			b[n]=0;
//			int diff = a[0]-b[1];
			int  diff = 0;
//			int flag=0;
//			for(int i=1; i<n; i++) {
//				int tempDiff = (a[i]-b[i+1]);
//				if(diff<tempDiff) {
//					diff=tempDiff;
//					flag=i;
//				}
//			}
			for(int i=0; i<n; i++) {
//				if(i==flag)continue;
				int tempDiff = diff+(a[i]-b[i+1]);
				diff = diff<tempDiff?tempDiff:diff;
			}
			output[testCase]=diff;
		}
		for(int e : output) System.out.println(e);
		scanner.close();
	}

}
