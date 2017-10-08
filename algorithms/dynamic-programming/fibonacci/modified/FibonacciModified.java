package fibonacci.modified;

import java.math.*;
import java.util.Scanner;

public class FibonacciModified {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long a[] = new long[22];
		BigInteger x = in.nextBigInteger();
		BigInteger y = in.nextBigInteger();
		BigInteger z = new BigInteger("0");
		int n = in.nextInt();
		int i = 0;
		for (i = 0; i < n - 2; i++) {
			z = (y.multiply(y)).add(x);
			x = y;
			y = z;
		}
		System.out.println(z);
	}
}
