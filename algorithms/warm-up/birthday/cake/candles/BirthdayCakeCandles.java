package birthday.cake.candles;

import java.util.Scanner;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		int k = 1;
		for (int i = 0; i < n; i++) {
			if (a[i] > k)
				k = a[i];
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == k)
				count++;
		}
		System.out.println(count);
	}
}
