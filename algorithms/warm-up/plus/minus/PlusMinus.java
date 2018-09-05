package plus.minus;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i;
		float pos = 0, neg = 0, neu = 0;
		// System.out.println("enter the no of elements");
		n = in.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		// System.out.println("checking fraction");
		for (i = 0; i < n; i++) {
			if (a[i] > 0) {
				pos++;
			} else if (a[i] < 0) {
				neg++;
			} else {
				neu++;
			}
		}
		// System.out.println(pos+" "+neg+" "+neu);
		System.out.println((float) (pos / n));
		System.out.println((float) (neg / n));
		System.out.println((float) (neu / n));
		in.close();
	}
}
