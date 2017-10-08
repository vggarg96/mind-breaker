package chocolate.feast;

import java.util.Scanner;

public class ChocoloateFeast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int x, y, z;
			x = n / c;
			y = x;
			z = x;
			while (x >= m) {
				x = x / m + x % m;
				y = y + x - z % m;
				z = x;
			}
			System.out.println(y);
		}
	}
}
