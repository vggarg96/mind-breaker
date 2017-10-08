package recursion;

import java.util.Scanner;

public class Recursion {
	static int factorial(int n) {
		int x = 1;
		if (n == 0)
			return 1;
		else {
			for (int i = 1; i <= n; i++)
				x = x * i;
			return x;
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = factorial(n);
		System.out.println(res);
	}
}
