package twin.array;

import java.util.Scanner;

public class TwinArray {

	static int z, y;

	static int min(int a[]) {
		int q = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < q) {
				q = a[i];
				z = i;
			}
		}
		return q;
	}

	static int min(int a[], int d) {
		int q = a[0];
		for (int i = 0; i < a.length; i++) {
			if ((a[i] < q) && (i != d)) {
				q = a[i];
			}
		}
		return q;
	}

	static int twin(int a[], int b[]) {
		int i;
		int w = min(a);
		y = z;
		int e = min(b);
		if (y == z) {
			if (w > e) {
				w = min(a, z);
			} else if (w < e) {
				e = min(b, z);
			} else {
				int g = min(a, z);
				int h = min(b, z);
				if (g > h)
					e = h;
				else
					w = g;
			}
		}
		return (w + e);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int b[] = new int[n];
		for (i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}
		int result = twin(a, b);
		System.out.println(result);
	}
}
