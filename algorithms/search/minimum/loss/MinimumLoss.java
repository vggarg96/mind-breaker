package minimum.loss;

import java.util.Scanner;

public class MinimumLoss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long p[] = new long[n];
		for (int i = 0; i < n; i++)
			p[i] = in.nextLong();
		for (int i = 0; i < n; i++)
			System.out.print(p[i] + " ");
		long x = p[1] - p[0];
		for (int i = 2; i < n; i++)
			if (x > p[i] - p[i - 1])
				x = p[i] - p[i - 1];
		System.out.println("\n" + x);
	}
}
