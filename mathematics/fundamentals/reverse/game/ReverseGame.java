package reverse.game;

import java.util.Scanner;

public class ReverseGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int j = 0; j < t; j++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int x = 0;
			if (k < n / 2)
				x = (k + 1) * 2 - 1;
			else
				x = (n - 1 - k) * 2;
			System.out.println(x);
		}
	}
}
