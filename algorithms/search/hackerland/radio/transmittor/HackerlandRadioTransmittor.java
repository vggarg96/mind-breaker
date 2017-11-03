package hackerland.radio.transmittor;

import java.util.Scanner;

public class HackerlandRadioTransmittor {
	static void merge(int a[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = a[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = a[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j])
				a[k++] = L[i++];
			else
				a[k++] = R[j++];
		}
		while (i < n1) {
			a[k++] = L[i++];
		}
		while (j < n2) {
			a[k++] = R[j++];
		}
	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[100001];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		sort(a, 0, n - 1);
		int c = 0, z = a[0], m = a[n - 1],j=0;
		while (j<n-1) {
			
			int x = z + k;
			if (a[x] == 0) {
				while (a[x] == 0)
					x--;
			}
			c++;
			z = x + k + 1;
		}
		System.out.println(c);
	}
}
//5 1
//1 2 3 4 5