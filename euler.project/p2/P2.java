package p2;

import java.util.Scanner;

public class P2 {

	static long sum(long k) {
		long z = 1, x = 1, c = 3, v = z + x, sum = 0;
		while (v < k) {
			if (c % 3 == 0)
				sum += v;
			z = x;
			x = v;
			v = z + x;
			c++;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			System.out.println(sum(n));

		}
	}

}
