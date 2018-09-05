package marcs.cakewalk;

import java.util.Scanner;

public class MarcsCakewalk {
	static void merge(int a[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			merge(a, l, m);
			merge(a, m + 1, r);
			sort(a, l, m, r);
		}
	}

	static void sort(int a[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = a[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = a[m + 1 + j];

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j])
				a[k++] = L[i++];
			else
				a[k++] = R[j++];
		}
		while (i < n1)
			a[k++] = L[i++];
		while (j < n2)
			a[k++] = R[j++];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		merge(a, 0, n - 1);
		long sum = a[n - 1], t = 1;
		for (int i = n - 2; i >= 0; i--) {
			t *= 2;
			sum += a[i] * t;
		}
		System.out.println(sum);
	}
}
