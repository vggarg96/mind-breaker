package extra.Long.factorials;

import java.math.*;
import java.util.Scanner;

public class ExtraLongFactorials {
	static BigInteger fact(int n) {
		BigInteger f = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no");
		int n = in.nextInt();
		// System.out.println("compute factorial");
		System.out.println(fact(n));
	}
}
