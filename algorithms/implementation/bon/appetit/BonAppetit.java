package bon.appetit;

import java.util.Scanner;

public class BonAppetit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, sum = 0;
		// System.out.println("enter the no of items");
		int n = in.nextInt();
		// System.out.println("enter the not share item index");
		int share = in.nextInt();
		int a[] = new int[n];
		// System.out.println("enter the prices");
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		// System.out.println("enter the anna share");
		int charge = in.nextInt();
		// System.out.println("total amount");
		for (i = 0; i < n; i++) {
			sum = sum + a[i];
		}
		int result = 0;
		int amount = sum - a[share];
		int act = amount / 2;
		if (act == charge) {
			System.out.println("Bon Appetit");
		} else if (act > charge) {
			result = act - charge;
			System.out.println(result);
		} else {
			result = charge - act;
			System.out.println(result);
		}

	}
}
