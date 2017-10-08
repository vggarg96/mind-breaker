package diwali.lights;

import java.math.*;
import java.util.Scanner;

public class DiwaliLights {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			String s = "";
			BigInteger x = new BigInteger("2");
			BigInteger c = new BigInteger("1");
			x = x.pow(n);
			x = x.subtract(c);
			BigInteger z = new BigInteger("100000");
			x = x.mod(z);
			System.out.println(x);
		}
	}
}
