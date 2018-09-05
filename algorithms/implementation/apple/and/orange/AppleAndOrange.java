package apple.and.orange;

import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {
		int s, t, a, o, i, na, no, ac = 0, oc = 0;
		Scanner in = new Scanner(System.in);
		s = in.nextInt();
		t = in.nextInt();
		na = in.nextInt();
		no = in.nextInt();
		a = in.nextInt();
		o = in.nextInt();

		// System.out.println("values are" + s + "\t" + t + "\t" + a + "\t" +
		// o);
		int orange[] = new int[o];
		int apple[] = new int[a];
		for (i = 0; i < a; i++) {
			apple[i] = in.nextInt();
		}
		for (i = 0; i < o; i++) {
			orange[i] = in.nextInt();
		}
		for (i = 0; i < a; i++) {
			if (((na + apple[i]) >= s) && ((na + apple[i]) <= t)) {
				ac++;
			}
		}
		for (i = 0; i < o; i++) {
			if (((no + orange[i]) <= t) && ((no + orange[i]) >= s)) {
				oc++;
			}
		}
		System.out.println(ac);
		System.out.println(oc);
	}
}
