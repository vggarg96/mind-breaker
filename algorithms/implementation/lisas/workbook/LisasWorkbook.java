package lisas.workbook;

import java.util.Scanner;

public class LisasWorkbook {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		int p = 0;
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += a[i];
		for (int i = 0; i < n; i++) {
			p = p + a[i] / k;
			if (a[i] % k > 0)
				p++;
		}
		int x = 1, y = 0, z = 1, c = 0, i = 0;
		while (y != sum) {
			if (x > a[i]) {
				y = y + a[i];
				i++;
				if (i > a.length - 1)
					break;
				x = 1;
				z++;
			}
			if (x == z)
				c++;
			if ((x % k == 0) && (x != a[i]))
				z++;
			x++;
		}
		System.out.println(c);
	}
}
