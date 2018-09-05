package even.and.odd;

import java.util.Scanner;

public class EvenAndOddQuery {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = in.nextInt();
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int z = in.nextInt();
			int x = in.nextInt();
			if (a[z] % 2 == 0 && (z == x || a[z + 1] != 0))
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
	}
}
