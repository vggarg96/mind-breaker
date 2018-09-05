package army.game;

import java.util.Scanner;

public class ArmyGame {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a, p, q;
		p = n - n % 2;
		q = m - m % 2;
		a = p * q;
		int res;
		if ((n == 1) || (m == 1)) {
			res = a / 2;
			if (a % 2 != 0)
				res++;
		} else {
			res = a / 4;
			if (a % 4 != 0)
				res++;
		}
		if ((n % 2 != 0))
			res = res + m / 2 + m % 2;
		if ((m % 2 != 0))
			res = res + n / 2 + n % 2;
		if (((n % 2 != 0)) && ((m % 2 != 0)))
			res = res - 1;
		System.out.println(res);
	}
}
