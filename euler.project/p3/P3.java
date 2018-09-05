package p3;

import java.util.*;
import java.math.*;

public class P3 {

	static long factor(long n) {
		
		while (n % 2 == 0)
			n = n / 2;
		if (n == 1)
			return 2;
		int i = 3, z = 1;
		while (i < n / 2) {
			int m = 0;
			while (n % i == 0) {
				n = n / i;
				m = 1;
			}
			if (m == 1) {
				z = i;
				i = 3;
				continue;
			}
			i += 2;
		}
		if (n == 1)
			return z;
		else
			return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			System.out.println(factor(n));
		}
	}

}
