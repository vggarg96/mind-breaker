package leonardo.prime.factor;

import java.math.*;
import java.util.Scanner;

public class LeonardoPrimeFactor {
	static int prime(int m) {
		int x = 0, y;
		for (int i = 2; i <= m / 2; i++)
			if (m % i == 0) {
				x = 1;
				break;
			}
		if (x == 0)
			return m;
		else {
			y = prime(++m);
			return y;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int j = 0; j < n; j++) {
			String x = in.next();
			BigInteger p = new BigInteger(x);
			BigInteger sum = new BigInteger("1");
			BigInteger m = new BigInteger("0");
			int i = 2, count = 0;
			String s;
			int t;
			if (p.compareTo(sum) == 0) {
				count = 0;
			} else {
				while ((sum.compareTo(p) == 0) || (sum.compareTo(p) == -1)) {
					t = prime(i);
					s = "";
					s = s + t;
					m = new BigInteger(s);
					i = m.intValue();
					i++;
					// System.out.println(m.intValue());
					sum = sum.multiply(m);
					// System.out.println(sum);
					count++;
				}
				BigInteger v = new BigInteger("2");
				if (sum.compareTo(v) == 1) {
					sum = sum.divide(m);
					count--;
				}
			}
			System.out.println(count);
		}

	}
}
