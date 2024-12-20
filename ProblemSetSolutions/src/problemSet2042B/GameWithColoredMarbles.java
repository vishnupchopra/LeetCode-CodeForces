package problemSet2042B;

import java.util.HashMap;
import java.util.Scanner;

public class GameWithColoredMarbles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] otpt = new int[t];
		for(int i=0; i<t; i++) {
			int scoreAlice = 0;
			int n = scanner.nextInt();
			HashMap<Integer,Integer> Marbles = new HashMap<>();
			while(n!=0) {
				int Marble = Integer.parseInt(scanner.next());
				if(Marbles.containsKey(Marble)) {
					Marbles.put(Marble, Marbles.get(Marble)+1);
				}else {
					Marbles.put(Marble, 1);
				}
				--n;
			}
			for(int key : Marbles.keySet()) {
				if(Marbles.get(key)==1) {
					scoreAlice=scoreAlice+2;
//					Marbles.remove(key);
				}else {
					scoreAlice=scoreAlice+(Math.round(Marbles.get(key)/2)+1);
//					Marbles.remove(key);
				}
			}
			otpt[i]=scoreAlice;
		}
		for(int ele : otpt) {
			System.out.println(ele);
		}
		scanner.close();
	}
}