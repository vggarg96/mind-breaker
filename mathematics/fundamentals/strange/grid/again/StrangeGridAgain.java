package strange.grid.again;

import java.math.*;
import java.util.Scanner;

public class StrangeGridAgain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger r = in.nextBigInteger();
		BigInteger c = in.nextBigInteger();
		BigInteger z = new BigInteger("10");
		BigInteger x = new BigInteger("2");
		BigInteger v = new BigInteger("1");
		BigInteger res1, res2;
		if ((r.mod(x)).equals(v)) {
			res1 = r.divide(x);
			res1 = res1.multiply(z);
			res2 = c.subtract(v);
			res2 = res2.multiply(x);
			res1 = res1.add(res2);
		} else {
			res1 = r.subtract(v);
			res1 = res1.divide(x);
			res1 = res1.multiply(z);
			res2 = c.subtract(v);
			res2 = res2.multiply(x);
			res2 = res2.add(v);
			res1 = res1.add(res2);
		}
		System.out.println(res1);

	}
}
