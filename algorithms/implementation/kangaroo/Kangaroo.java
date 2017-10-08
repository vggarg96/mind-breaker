package kangaroo;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1, x2, v1, v2;
		x1 = in.nextInt();
		v1 = in.nextInt();
		x2 = in.nextInt();
		v2 = in.nextInt();
		// System.out.println(x1 + "\t" + v1 + "\t" + x2 + "\t" + v2);
		int x = x2 - x1;
		// System.out.println(x);
		int v = v1 - v2;
		if (v > 0) {
			// System.out.println(v);
			float t = x / v;
			// System.out.println(t);
			float d = v2 * t;
			float t1 = (x + d) / v1;
			// System.out.println(t1);
			float t2 = d / v2;
			// System.out.println(t2);
			// System.out.println(d);
			if ((t > 0) && (d > 0) && (t1 == t2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}
	}
}
