package a.very.big.sum;

import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		int n;
		long sum = 0;
		n = in.nextInt();
		long[] a = new long[n];
		// System.out.println("enter the elements");
		for (i = 0; i < n; i++) {
			sum += in.nextLong();
		}
		System.out.println(sum);

	}
}
