package problemSet282A;

import java.util.Scanner;

public class BitPlusPlus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int Sum = 0;
		while(n!=0) {
			String lne = scanner.next();
			boolean bol = false;
			for(int i=0; i<lne.length(); i++) {
				if(lne.charAt(i)=='+')bol=true;
			}
			Sum = bol?Sum+1:Sum-1;
			--n;
		}
		System.out.println(Sum);
		scanner.close();
	}

}
