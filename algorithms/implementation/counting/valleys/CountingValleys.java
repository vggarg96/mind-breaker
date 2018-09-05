package counting.valleys;

import java.util.Scanner;

public class CountingValleys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of steps");
		int n = in.nextInt();
		int steps[] = new int[n];
		// int count = 0;
		int res = 0;
		int a[] = new int[n];
		int i;
		char c[] = new char[n];
		c = in.next().toCharArray();
		// for (i = 0; i < n; i++) {
		// System.out.println(c[i]);
		// }
		for (i = 0; i < n; i++) {
			if (c[i] == 'U')
				steps[i] = 1;
			;
			if (c[i] == 'D')
				steps[i] = -1;
		}
		// count=steps[0];
		// for (i = 1; i < n; i++) {
		// count = count + steps[i];
		// if ((count < 0) && (steps[i] < 0) && (steps[i - 1] >= 0))
		// res++;
		// }
		boolean b[] = new boolean[n];
		int x = 0, y = 0;
		int up[] = new int[n];
		int down[] = new int[n];
		// up[0] = 1;
		for (i = 0; i < n; i++) {
			if (steps[i] == 1) {
				x++;
				y--;
				up[i] = x;
				down[i] = y;
			} else {
				x--;
				y++;
				up[i] = x;
				down[i] = y;
			}
		}
		for (i = 0; i < n; i++) {
			if ((down[i] - up[i]) > 0) {
				b[i] = true;
			} else
				b[i] = false;

		}
		for (i = 0; i < n - 1; i++) {
			if ((b[i]) && (!b[i + 1])) {
				res++;
			}
		}

		System.out.println(res);

	}
}
