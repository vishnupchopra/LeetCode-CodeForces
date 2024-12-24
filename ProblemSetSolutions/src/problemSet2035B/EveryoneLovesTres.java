package problemSet2035B;

import java.util.Scanner;

public class EveryoneLovesTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		String[] output = new String[t];
		
		for(int testCase=0; testCase<t; testCase++) {
			int n = scanner.nextInt();
			if(n==1 || n==3) output[testCase]="-1";
			else if(n%2==0) output[testCase]=evenNumbers(n);
			else output[testCase]=oddNumbers(n);
		}
		
		for(String str : output) System.out.println(str);
		
		scanner.close();
	}
	private static String evenNumbers(int n) {
		String res = "66";
		for(int i=n; i!=2; i--) {
			res = "3"+res;
		}
		return res;
	}
	
	private static String oddNumbers(int n) {
		String res = "6366";
		for(int i=n; i!=4; i--) {
			res = "3"+res;
		}
		return res;
	}
}