package equal.to.prodect;

import java.util.Scanner;

public class EqualToProduct {

	static void sort(int a[], int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(a, l, mid);
			sort(a, mid + 1, r);
			merge(a, l, mid, r);
		}
	}

	static void merge(int a[], int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int b[] = new int[n1];
		int c[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			b[i] = a[l + i];
		}
		for (int i = 0; i < n2; i++) {
			c[i] = a[mid + i + 1];
		}
		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (b[i] > c[j])
				a[k++] = c[j++];
			else
				a[k++] = b[i++];
		}
		while (i < n1)
			a[k++] = b[i++];
		while (j < n2)
			a[k++] = c[j++];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int k = 0; k < t; k++) {
			int n = in.nextInt();
			int x = in.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
//	        /System.out.println("1");
			sort(a, 0, n - 1);
			int f = 0;
//	        System.out.println("3");
			for (int i = 0; i < n; i++) {
				if (a[i] != 0 && x % a[i] == 0) {
					int z = x / a[i];
					for (int j = i + 1; j < n; j++) {
						if (z == a[j]) {
							System.out.println("Yes");
							f = 1;
						}
					}
				}
			}
			if (f == 0) {
				System.out.println("No");
			}
		}
	}

}
