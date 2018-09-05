package the.bomberman.game;

import java.util.Scanner;

public class TheBombermanGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
		String s;
		int a[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			s = in.next();
			for (int j = 0; j < c; j++) {
				if (s.charAt(j) == 'O')
					a[i][j] = 3;
				else
					a[i][j] = 0;
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}