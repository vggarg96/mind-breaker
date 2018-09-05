package larrys.array;

import java.util.Scanner;

public class LarrysArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++)
				a[j] = in.nextInt();
			int c = 0;
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[j] > a[k])
						c++;
				}
			}
			if ((c % 2 == 0) && (n % 2 == 1))
				System.out.println("YES");
			else if ((n % 2 == 0) && ((c % 2 == 0) || (c % 3 == 1)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

	
}
