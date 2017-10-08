package between.two.sets;

import java.util.Scanner;

public class BetweenTwoSets {
	static int flag1 = 1;
	static int flag2 = 1;

	static void lower(int a[], int c) {
		int i;
		flag1 = 1;
		for (i = 0; i < a.length; i++) {
			if (c % a[i] != 0)
				flag1 = 0;
		}
	}

	static void upper(int b[], int c) {
		int i;
		flag2 = 1;
		for (i = 0; i < b.length; i++) {
			if (b[i] % c != 0)
				flag2 = 0;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i, count = 0;
		int a[] = new int[n];
		int m = in.nextInt();
		int b[] = new int[m];
		// boolean f[] = new boolean[1000];
		// boolean g[] = new boolean[100];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		for (i = a[n - 1]; i <= b[0]; i = i + a[n - 1]) {
			lower(a, i);
			upper(b, i);
			if ((flag1 == 1) && (flag2 == 1)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
