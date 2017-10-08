package divisible.sum.pairs;

import java.util.Scanner;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the size of array");
		int n = in.nextInt();
		// System.out.println("enter the key element");
		int key = in.nextInt();
		// System.out.println("read the elements");
		int i, j, count = 0;
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		// System.out.println("checking for pair elements");
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if ((a[i] + a[j]) % key == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
