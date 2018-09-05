package sherlock.and.moving;

import java.util.Scanner;

public class SherlockAndMovingTiles {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double l = in.nextDouble();
		double v1 = in.nextDouble();
		double v2 = in.nextDouble();
		double q = in.nextDouble();
		double x = Math.sqrt(2);
		double d1 = x * l;
		double v3 = v1 > v2 ? v1 - v2 : v2 - v1;
		for (int i = 0; i < q; i++) {
			double a = in.nextDouble();
			double d2 = x * Math.sqrt(a);
			if (v3 != 0) {
				System.out.println(Math.abs(d1 - d2) / v3);
			} else
				System.out.println(0.00000);

		}
	}
}
