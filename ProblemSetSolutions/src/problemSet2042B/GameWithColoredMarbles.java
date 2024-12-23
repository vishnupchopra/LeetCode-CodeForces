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
					Marbles.put(Marble,2);
				}else {
					Marbles.put(Marble, 1);
				}
				--n;
			}
//			System.out.println(Marbles);
			int spc=0;
			for(int key : Marbles.keySet()) {
				if(Marbles.get(key)==1) {
					spc++;
//					System.out.println("1");
//					Marbles.remove(key);
				}else{
					scoreAlice=scoreAlice+1;
//					if(Marbles.get(key)%2!=0) {
//						scoreAlice=scoreAlice+((Math.round(Marbles.get(key)/2)+1));
//					}
//					else {
//						scoreAlice=scoreAlice+((Math.round(Marbles.get(key)/2)));
//					}
//					System.out.print("else");
//					System.out.println(scoreAlice);
//					Marbles.remove(key);
				}
			}
			scoreAlice=spc%2==0?scoreAlice+spc:scoreAlice+spc+1;
			otpt[i]=scoreAlice;
		}
		for(int ele : otpt) {
			System.out.println(ele);
		}
		scanner.close();
	}
}