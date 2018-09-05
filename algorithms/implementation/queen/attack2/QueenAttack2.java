package queen.attack2;

import java.util.Scanner;

public class QueenAttack2 {
	static int queen(int c[][], int a, int b, int n) {
		int ct = 0, i = a - 1, j = b;
		while (i >= 1) {
			if (c[i--][j] != -1) {
				ct++;
				continue;
			}
			break;
		}

		i = a + 1;
		while (i <= n) {
			if (c[i++][j] != -1) {
				ct++;
				continue;
			}
			break;
		}
		i = a;
		j = b - 1;
		while (j >= 1) {
			if (c[i][j--] != -1) {
				ct++;
				continue;
			}
			break;
		}
		j = b + 1;
		while (j <= n) {
			if (c[i][j++] != -1) {
				ct++;
				continue;
			}
			break;
		}
		i = a + 1;
		j = b + 1;
		while (i <= n && j <= n) {
			if (c[i++][j++] != -1) {
				ct++;
				continue;
			}
			break;
		}
		i = a - 1;
		j = b - 1;
		while (i >= 1 && j >= 1) {
			if (c[i--][j--] != -1) {
				ct++;
				continue;
			}
			break;
		}
		i = a + 1;
		j = b - 1;
		while (i <= n && j >= 0) {
			if (c[i++][j--] != -1) {
				ct++;
				continue;
			}
			break;
		}
		i = a - 1;
		j = b + 1;
		while (i >= 0 && j <= n) {
			if (c[i--][j++] != -1) {
				ct++;
				continue;
			}
			break;
		}
		return ct;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c[][] = new int[n + 1][n + 1];
		for (int i = 0; i < k; i++) {
			int q = in.nextInt();
			int w = in.nextInt();
			c[q][w] = -1;
		}
//		long qq = System.nanoTime();
		int z = queen(c, a, b, n);
//		long qqq = System.nanoTime();
//		System.out.println(qqq - qq);
		System.out.println(z);
	}
 
}
