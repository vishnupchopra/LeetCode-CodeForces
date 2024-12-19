package problemSet2048A;

import java.util.Scanner;

public class KevinAndCombinationLock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] testCases = new int[scanner.nextInt()];
		for(int i=0; i<testCases.length; i++) {
			testCases[i]=scanner.nextInt();
		}
		String Unlocked = "NO";
		for(int i : testCases) {
			if(i>33) {
				ops(Unlocked,i);
			}else if(i==33) {
				Unlocked="YES";
			}
		}
		System.out.println(Unlocked);
		scanner.close();
	}
	public static void ops(String Unlocked, int i) {
		StringBuilder sb = new StringBuilder(Integer.toString(i));
		
		for(int j=0; j<sb.length()-1; j++) {
			if((sb.charAt(j)==sb.charAt(j+1))&&sb.charAt(j)==3) {
				sb.delete(j, j+2);
			}
		}
		System.out.println(sb.toString());
		int ni = Integer.parseInt(sb.toString());
		while(ni>33) ni-=33;
		if(ni==0) Unlocked="YES";
	}

}
