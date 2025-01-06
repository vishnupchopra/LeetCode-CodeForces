package problemSet2007B;

import java.util.Scanner;

public class IndexAndMaximumValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[][] res = new int[t][];
		
		for(int testCase=0; testCase<t; testCase++) {
			
			int n = scanner.nextInt(); // length of array
			int m = scanner.nextInt(); // number of operations
			
			int[] initArray = new int[n]; // array itself
			
			int maxValue = Integer.MIN_VALUE;
			int maxIndice = 0;
			for(int i=0; i<n; i++) {
				initArray[i]=scanner.nextInt();
				if(initArray[i]>maxValue) {
					maxValue=initArray[i];
					maxIndice=i;
				}
				} //populate the array
			
			int[] maxValues = new int[m];
			
			for(int i=0; i<m; i++) { // m operations
				
				maxValue = initArray[maxIndice];
				
				if(scanner.next().equals("+")) {
					
					int l = scanner.nextInt();
					int r = scanner.nextInt();
					
					if(maxValue>=l&&maxValue<=r) {
						initArray[maxIndice] += 1;
					}
					

					
				} else {
					
					int l = scanner.nextInt();
					int r = scanner.nextInt();
					
					if(maxValue>=l&&maxValue<=r) {
						initArray[maxIndice] -= 1;
					}
					

					
				}
				

				
				maxValues[i]=initArray[maxIndice];
				
			}
			res[testCase] = maxValues;
			
		}
		for(int[] inner : res) {
			for(int i : inner) System.out.print(i+" ");
			System.out.println("");
		}
		scanner.close();
	}

}
