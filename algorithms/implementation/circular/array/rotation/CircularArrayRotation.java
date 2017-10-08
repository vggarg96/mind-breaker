package circular.array.rotation;

import java.util.Scanner;

public class CircularArrayRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = n - 1; i >= 0; i--)
			b[i] = a[(i + m) % n];
		for (int i = 0; i < q; i++) {
			int w = in.nextInt();
			System.out.println(b[w]);
		}
	}
}
