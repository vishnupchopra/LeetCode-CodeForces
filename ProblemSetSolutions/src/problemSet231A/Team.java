package problemSet231A;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//input number of problems;
		int n = scanner.nextInt();
		
		int[] problems = new int[n];
		int totalProblems = 0;
		
		//iterate
		for(int ele : problems) {
			int sum = 0;
			for(int i=0; i<3; i++) {
				String inp = scanner.next();
				int inpi = Integer.parseInt(inp);
				sum = sum + inpi;
			}
			if(sum>=2) {
				totalProblems =totalProblems + 1;
			}
		}
		System.out.println(totalProblems);
		scanner.close();
	}

}
