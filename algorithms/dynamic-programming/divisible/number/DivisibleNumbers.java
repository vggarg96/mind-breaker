package divisible.number;

import java.util.Scanner;

public class DivisibleNumbers {
	static boolean checkz(long i) {
		long z = 1;
		while (i > 0) {
			z = i % 10;
			i = i / 10;
			if (z == 0)
				return false;
		}
		return true;
	}

	static boolean check(long i) {
		long z = 1, a = 0, m = 1;
		while (i > 0) {
			z = i % 10;
			i = i / 10;
			a += z;
			m *= z;
		}
		if (a >= m)
			return true;
		return false;
	}

	static long dig(long i) {
		long z = 1, a = 0;
		while (i > 0) {
			z = i % 10;
			i = i / 10;
			a++;
		}
		return a;
	}

	// 135=17*5 185=5*37 225=25*9 245=7*7*5 275=25*11 315=7*9*5 325=13*25 365 395
	// 405=81*5 425=17*25 455=13*7*5 475=19*25 485 505=101*5 525=5*5*3*7
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// for (int t = 525; t < 526; t++) {
		// int n = t;
//		if (n % 10 == 0)
//			continue;
		// if()
		long i = n;
		// if (n % 11 == 0 && (n % 5 == 0 || n % 9 == 0))
		if ((n % 25 == 0 && (n % 25) % 2 == 1) || (n % 11 == 0 && (n % 5 == 0 || n % 9 == 0))
				|| (n % 5 == 0 && n % 7 == 0 && n % 2 == 1))
			i = n * 100000000;
		// i = n * 10000000;
		// if (n % 5 == 0)
		// n *= 2;
		while (true) {
			if (i % 10 == 0) {
				i = i + n;
				continue;
			}
			// boolean a = checkz(i);
			if (checkz(i)) {
				// boolean b = check(i);
				if (check(i)) {
					System.out.println(dig(i));
					// System.out.println(t + " " + dig(i) + " " + i);
					break;
				}
			}
			i = i + n;
		}
	}
}
