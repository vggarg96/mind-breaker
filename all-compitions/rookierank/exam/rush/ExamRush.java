package exam.rush;

import java.util.Scanner;

public class ExamRush {
	
	static void sort(int a[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(a, l, m);
			sort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}

	static void merge(int a[], int l, int m, int r) {
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

	static void res(int a[], int t) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (t >= a[i]) {
				t -= a[i];
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		sort(a, 0, n - 1);
		res(a, t);
	}
}
