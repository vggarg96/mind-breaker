package cutting.paper.square;

import java.math.*;
import java.util.Scanner;

public class CuttingPaperSqaure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		BigInteger m = in.nextBigInteger();
		n = n.multiply(m);
		BigInteger b = new BigInteger("1");
		n = n.subtract(b);
		System.out.println(n);
	}
}
