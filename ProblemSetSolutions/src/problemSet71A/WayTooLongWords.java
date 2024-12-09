package problemSet71A;

import java.util.Scanner;
public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] arrayOfWords = new String[n];
		
		for(int i=0; i<n; i++) {
			String word = scanner.next();
			if(word.length()>10) {
				word = word.charAt(0)+String.valueOf(word.length()-2)+word.charAt(word.length()-1);
			}else {
				//do nothing;
			}
			arrayOfWords[i] = word;
		}
		for(String word : arrayOfWords) {
			System.out.println(word);
		}
		
		scanner.close();
	}

}