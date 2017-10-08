package the.hurdle.race;

import java.util.Scanner;

public class TheHurdleRace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// System.out.println("enter the no of hurdles");
		int n = s.nextInt();
		// System.out.println("initial max height");
		int k = s.nextInt();
		// System.out.println("enter the height of the hurdles");
		int a[] = new int[n];
		int i, q = k;
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (k < a[i]) {
				k = a[i];
			}
		}
		int res = 0;
		if (q < k) {
			res = k - q;
		} else {
			res = 0;
		}
		System.out.println(res);
	}
}
