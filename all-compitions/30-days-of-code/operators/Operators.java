package operators;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p = in.nextDouble();
		int tip = in.nextInt();
		int tax = in.nextInt();
		double price;
		price = p + (p * tip / 100) + (p * tax / 100);
		int total;

		if (price - (int) price > .5)
			total = (int) price + 1;
		else
			total = (int) price;
		System.out.println("The total meal cost is " + total + " dollars.");
	}
}
