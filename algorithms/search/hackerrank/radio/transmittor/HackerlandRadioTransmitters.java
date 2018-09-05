package hackerrank.radio.transmittor;

import java.util.Scanner;

public class HackerlandRadioTransmitters {
	
	 static void merge(int a[], int l, int r) {
			if (l < r) {
				int mid = (l + r) / 2;
				merge(a, l, mid);
				merge(a, mid + 1, r);
				sort(a, l, mid, r);
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
			int i = 0, j = 0;
			int k = l;
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

		static int find(int a[], int k, int x) {
			int i = x + 1;
			while (i < a.length) {
				if (a[i] == k)
					return a[i];
				else if (a[i] < k) {
					i++;
					continue;
				} else {
					k--;
					i = x;
				}

			}
			return a[x];
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			
			merge(a, 0, a.length - 1);
			
			int max = 0, c = 0, i = 0, t = 0;
			while (max < a[n - 1] && i < n) {
				if (a[i] <= max) {
					i++;
					continue;
				} else {
					t = find(a, a[i] + k, i);
					max = t + k;
					// x = a[i];
					// max = x + 2 * k;
					c++;
					i++;
				}
			}
			System.out.println(c);
		}
}
