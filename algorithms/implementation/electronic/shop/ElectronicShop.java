package electronic.shop;

import java.util.Scanner;

public class ElectronicShop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the money monica have:");
		int mon = in.nextInt();
		// System.out.println("enter the no of keyboards");
		int n = in.nextInt();
		// System.out.println("enter the no of USB");
		int m = in.nextInt();
		int i;
		// System.out.println("enter the price of keyboards");
		int a[] = new int[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		// System.out.println("enter the price of USB");
		int b[] = new int[m];

		for (i = 0; i < m; i++)
			b[i] = in.nextInt();
		int sum[] = new int[n * m];
		int j;
		int k = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				sum[k++] = a[i] + b[j];
		}
		int x = 0, y = -1;
		for (i = 0; i < sum.length; i++) {
			if ((x < sum[i]) && (sum[i] <= mon))
				x = sum[i];
		}
		if (x != 0)
			System.out.println(x);
		else
			System.out.println(y);
	}
}
