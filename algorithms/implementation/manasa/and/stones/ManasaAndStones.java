package manasa.and.stones;

import java.util.Scanner;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int j = 0; j < t; j++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == b) {
				System.out.println(a * (n - 1));
				continue;
			} else if (b < a) {
				int z = b;
				b = a;
				a = z;
			}
			for (int i = 0; i < n; i++) {
				int x = (b * i) + a * (n - 1 - i);
				System.out.print(x + " ");

			}
			System.out.println();
		}
	}

}
