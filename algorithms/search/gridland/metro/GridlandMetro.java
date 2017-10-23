package gridland.metro;

import java.util.Scanner;

public class GridlandMetro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		long m = in.nextLong();
		long k = in.nextLong();
//		boolean x[][] = new boolean[][m + 1];
		long sum = n * m, c = 0;
		for (int i = 1; i <= k; i++) {
			long r = in.nextLong();
			long c1 = in.nextLong();
			long c2 = in.nextLong();
//			for (long j = c1; j <= c2; j++) {
//				if (!x[r][j]) {
//					x[r][j] = true;
//					c++;
//				}
//			}
		}
		System.out.println(sum - c);
	}

}
