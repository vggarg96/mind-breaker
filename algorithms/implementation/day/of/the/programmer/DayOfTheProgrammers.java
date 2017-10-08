package day.of.the.programmer;

import java.util.Scanner;

public class DayOfTheProgrammers {
	public static void main(String[] args) {
		int pgday = 256;
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int n = 12;
		int[] mm = new int[n];
		int i;
		int[] mon = new int[2];
		mon[0] = 0;
		mon[1] = 0;
		for (i = 0; i < n; i++) {
			if (i <= n / 2) {
				if (i % 2 == 0) {
					mm[i] = 31;
				} else {
					mm[i] = 30;
				}
			} else {
				if (i % 2 == 0) {
					mm[i] = 30;
				} else {
					mm[i] = 31;
				}
			}
		}
		if (year >= 1919) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				// System.out.println("year is a leap year");
				mm[1] = 29;
			} else {
				// System.out.println("year is not a leap year");
				mm[1] = 28;
			}
		} else if (year <= 1917) {
			if ((year % 4 == 0)) {
				// System.out.println("year is a leap year");
				mm[1] = 29;
			} else {
				// System.out.println("year is not a leap year");
				mm[1] = 28;
			}
		} else {
			mm[1] = 15;
		}
		// for (i = 0; i < n; i++) {
		// System.out.println((i + 1) + " " + mm[i]);
		// }
		i = 0;
		while (pgday >= 30) {
			pgday = pgday - mm[i];
			i++;
			mon[1] = i + 1;
		}
		if (mon[1] > 9) {
			mon[0]++;
			mon[1] = mon[1] % 10;
		}
		System.out.println(pgday + "." + mon[0] + mon[1] + "." + year);

	}
}
