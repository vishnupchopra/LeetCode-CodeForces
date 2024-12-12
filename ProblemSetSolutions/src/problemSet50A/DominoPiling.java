package problemSet50A;

import java.util.Scanner;

public class DominoPiling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] rectangularBoard = new int[Integer.parseInt(scanner.next())][Integer.parseInt(scanner.next())];
		
		int DominoTiles = (rectangularBoard.length==1&&rectangularBoard[0].length==1)?0:1;
		int cas = (rectangularBoard.length%2==0)?(rectangularBoard[0].length%2==0)?1:2:(rectangularBoard[0].length%2==0)?3:4;
		
		//Cases
		
		switch(cas){
			case 1:
				DominoTiles = (rectangularBoard.length*rectangularBoard[0].length)/2;
				break;
			case 2:
				DominoTiles = (rectangularBoard.length/2)*(rectangularBoard[0].length);
				break;
			case 3:
				DominoTiles = (rectangularBoard[0].length)*(rectangularBoard.length)/2;
				break;
			case 4:
				DominoTiles = Math.round((rectangularBoard.length*rectangularBoard[0].length)/2);
				break;
			default:
				System.out.println("NaN");
		}
		System.out.println(DominoTiles);
		scanner.close();
	}

}