package birthday.chcocolate;

import java.util.Scanner;

public class BirthdayChocolate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the of pieces");
		int n = in.nextInt();
		// System.out.println("enter the values on pieces");
		int a[] = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		// System.out.println("enter the birth date");
		int day = in.nextInt();
		// System.out.println("enter the birth month");
		int mon = in.nextInt();
		int count = 0, sum = 0;
		;
		for (i = 0; i < n; i++) {
			sum = 0;
			if (i + mon <= a.length) {
				for (int j = i; j < i + mon; j++) {

					sum += a[j];
				}
				if (sum == day)
					count++;
			}
		}
		System.out.println(count);
	}
}
