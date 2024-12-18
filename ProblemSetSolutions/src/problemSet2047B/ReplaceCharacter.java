package problemSet2047B;

import java.util.HashMap;
import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] intArr = new int[t];
		String[] strArr = new String[t];
		for(int i=0; i<t; i++) {
			intArr[i] = scanner.nextInt();
			strArr[i] = scanner.next();
		}
		for(int j=0; j<t; j++) {
			int n = intArr[j];
			String s = strArr[j];
			StringBuilder sb = new StringBuilder(s);
			HashMap<Character,Integer> charCount = new HashMap<>();
			char dsChar=0;
			int cnt = 0;
			for(char c:s.toCharArray()) {
				charCount.put(c, charCount.getOrDefault(c,0)+1);
				if(cnt<charCount.get(c)) {
					dsChar = c;
					cnt = charCount.get(c);
				}
			}
			for(int i=0; i<n; i++) {
				if(s.charAt(i)!=dsChar) {
					sb.setCharAt(i, dsChar);
					break;
				}
			}
			System.out.println(sb.toString());
		}
		scanner.close();
	}

}