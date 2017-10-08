package taun.and.bday;

import java.math.*;
import java.util.Scanner;

public class TaunAndBDay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of test cases");
		int t = in.nextInt();
		int i;
		int b[] = new int[t];
		int w[] = new int[t];
		int x[] = new int[t];
		int y[] = new int[t];
		int z[] = new int[t];
		// System.out.println("enter the black &white gifts and there values");
		for (i = 0; i < t; i++) {
			b[i] = in.nextInt();
			w[i] = in.nextInt();
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			z[i] = in.nextInt();
		}

		for (i = 0; i < t; i++) {
			BigInteger x1;
			x1 = BigInteger.valueOf(x[i]);
			BigInteger y1;
			y1 = BigInteger.valueOf(y[i]);
			BigInteger z1;
			z1 = BigInteger.valueOf(z[i]);
			BigInteger b1;
			b1 = BigInteger.valueOf(b[i]);
			BigInteger w1;
			w1 = BigInteger.valueOf(w[i]);
			BigInteger sum = new BigInteger("0");
			if ((x[i] + z[i]) < y[i]) {
				// sum = (b[i] * x[i]) + (w[i] * x[i]) + (w[i] * z[i]);
				sum = ((b1.multiply(x1)).add(w1.multiply(x1))).add(w1.multiply(z1));
			} else if ((y[i] + z[i]) < x[i]) {
				// sum = (b[i] * y[i]) + (w[i] * y[i]) + (b[i] * z[i]);
				sum = ((b1.multiply(y1)).add(w1.multiply(y1))).add(b1.multiply(z1));
			} else {
				// sum = b[i] * x[i] + w[i] * y[i];
				sum = sum = ((b1.multiply(x1)).add(w1.multiply(y1)));
			}
			System.out.println(sum);
		}
	}
}
