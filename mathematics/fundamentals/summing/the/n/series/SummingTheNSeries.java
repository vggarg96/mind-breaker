package summing.the.n.series;

import java.math.*;
import java.util.Scanner;

public class SummingTheNSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			BigInteger n = in.nextBigInteger();
			BigInteger m = new BigInteger("2");
			BigInteger b = new BigInteger("1");
			BigInteger res;
			BigInteger x = new BigInteger("1000000007");
			res = n.subtract(b);
			res = res.multiply(m);
			res = res.add(m);
			res = res.multiply(n);
			res = res.divide(m);
			res = res.mod(x);
			System.out.println(res);
		}
	}
}
