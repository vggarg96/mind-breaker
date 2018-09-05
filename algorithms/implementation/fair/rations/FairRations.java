package fair.rations;

import java.util.Scanner;

public class FairRations {
	static int flag = 1;

	static void odd(int a[]) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				c++;
		}
		if (c % 2 != 0)
			flag = 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		odd(a);
		int x = 0;
		if (flag != 0) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 != 0) {
					a[i]++;
					a[i + 1]++;
					x = x + 2;
				}
			}
			System.out.println(x);
		} else
			System.out.println("NO");
	}
}
