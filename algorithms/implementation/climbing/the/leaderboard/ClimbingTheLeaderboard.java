package climbing.the.leaderboard;

import java.util.Scanner;

public class ClimbingTheLeaderboard {
	static int cal(int a[], int rank[], int c, int d) {
		int i, x = 0, y = 0;
		y = d;
		for (i = y; i >= 0; i--) {
			if (c > a[i]) {
				continue;
			} else if (c == a[i]) {

				x = rank[i];
				// System.out.println(i);
				return x;
			} else {

				x = rank[i] + 1;
				// System.out.println(i);
				return x;
			}
		}

		return 1;
	}

	static int index(int c, int rank[], int a[], int d) {
		int i, x = 0;
		for (i = d; i >= 0; i--) {
			if (c == rank[i]) {
				x = i - 1;
				return x;
			}
		}
		return d;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of existing player ");
		int n = in.nextInt();
		// System.out.println("enter there scores");
		int a[] = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		// System.out.println("assign rank to them");
		int rank[] = new int[n];
		rank[0] = 1;
		for (i = 1; i < n; i++) {
			if (a[i] == a[i - 1]) {
				rank[i] = rank[i - 1];
			} else {
				rank[i] = rank[i - 1] + 1;
			}
		}
		// for (i = 0; i < n; i++) {
		// System.out.println("score is :" + a[i] + " rank is :" + rank[i]);
		// }
		// System.out.println("enter the no of problems solved");
		int m = in.nextInt();
		// System.out.println("enter the score after each problem");
		int score[] = new int[m];
		// double a1 = System.nanoTime();
		for (i = 0; i < m; i++) {
			score[i] = in.nextInt();
		}
		int d = a.length - 1;
		// System.out.println(a[d] + " " + rank[d]);
		int cur = 0;
		// int srank = 0;
		for (i = 0; i < m; i++) {
			int c = score[i];
			// System.out.println("score of alice : "+c);
			if (c < a[a.length - 1]) {
				cur = rank[a.length - 1] + 1;
			} else if (c == a[a.length - 1]) {
				cur = rank[a.length - 1];
			} else {
				cur = cal(a, rank, c, d);
				d = index(cur, rank, a, d);
				// System.out.println(d);
			}
			System.out.println(cur);

		}
		// double a2 = System.nanoTime();
		// double time = a2 - a1;
		// System.out.println((time / 1000000) + "milleseconds");
	}
}
