package sequence.equation;

import java.util.Scanner;

public class SequenceEquation {
	static int search(int a, int b[]) {
		for (int j = 1; j < b.length; j++) {
			if (a == b[j])
				return j;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of elements");
		int n = in.nextInt();
		// System.out.println("read the elements");
		int a[] = new int[n + 1];
		int i;
		for (i = 1; i <= n; i++) {
			a[i] = in.nextInt();
		}
		// for(i=0;i<n;i++)
		// {
		// System.out.println(a[i]);
		// }
		int c = 0, d = 0;
		for (i = 1; i <= n; i++) {
			c = search(i, a);
			d = search(c, a);
			System.out.println(d);
		}
	}
}
