package revised.russian.roulette;

import java.util.Scanner;

public class RevisedRussianRoulette {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int z = 0, x = 0, c = 0, v = 0;
		for (int i = 0; i < n; i++) {
			x = in.nextInt();
			if (x == 1) {
				v++;
				if (z == 0) {
					z = 1;
					c++;
				} else
					z = 0;

			} else
				z = 0;
		}
		System.out.println(c + " " + v);
	}
}
