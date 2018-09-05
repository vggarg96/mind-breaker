package restaurant;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int l = in.nextInt();
			int b = in.nextInt();
			// System.out.println();
			if (l == b)
				System.out.println("1");
			else {
				int x, z = l * b;
				int f = 0;
				if (l > b)
					x = b;
				else
					x = l;
				for (int j = x; j > 1; j--) {
					if ((l % j == 0) && (b % j == 0)) {
						f = 1;
						System.out.println(z / (j * j));
						break;
					}
				}
				if (f == 0)
					System.out.println(z);
			}
		}
	}

}
