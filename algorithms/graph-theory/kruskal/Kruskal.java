package kruskal;

import java.util.Scanner;

public class Kruskal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int c[] = new int[m + 1];
		int l = 0, i = 1;
		int a[] = new int[m + 1];
		int b[] = new int[m + 1];
		while (l < m) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			int z = in.nextInt();
			if ((c[i] != 0) && (z < c[i]))
				c[i] = z;
			else if (c[i] == 0)
				c[i] = z;
			l++;
			i++;
		}
		int k = cal(c, a, b, n);
		System.out.println(k);
	}

	static int cal(int c[], int a[], int b[], int n) {
		int mincost = 0, x = 0, y = 0, u = 0, e = 0, v = 0, min = 0;
		int parent[] = new int[n + 1];
		while (e != n - 1) {
			min = 100001;
			for (int i = 1; i < a.length; i++) {
				if (c[i] < min) {
					min = c[i];
					x = i;
					u = a[i];
					v = b[i];
				}
			}
			while (parent[u] != 0)
				u = parent[u];
			while (parent[v] != 0)
				v = parent[v];
			if (u != v) {
				e++;
				mincost += min;
				parent[v] = u;
			}
			c[x] = 100001;
		}
		return mincost;
	}
}
