package problemSet2031B;

import java.util.Scanner;

public class PenchickAndSataySticks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for(int testCase=0; testCase<t; testCase++) {
			res[testCase]="YES";
			int n = scanner.nextInt();
			int[] sataySticks = new int[n];
			sataySticks[0]=scanner.nextInt();
			for(int i=1; i<n; i++) {
				sataySticks[i]=scanner.nextInt();
				if(sataySticks[i]-sataySticks[i-1]==-1) {
					int temp=sataySticks[i];
					sataySticks[i]=sataySticks[i-1];
					sataySticks[i-1]=temp;
				}
			}
			for(int i=1; i<n; i++) {
				if(sataySticks[i]<sataySticks[i-1]) {
					res[testCase]="NO";
				}
			}
		}
		for(String showResult : res) {
			System.out.println(showResult);
		}
		scanner.close();
	}

}
