package cut.the.sticks;

import java.util.Scanner;

public class CutTheSticks {
	static int count(int a[]) {
		int i, x = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				x++;
			}
		}
		if (x != 0)
			return x;
		else
			return 0;
	}

	static int max(int a[]) {
		int i, x = 0, y = 0;
		for (i = 0; i < a.length; i++) {
			if (x < a[i]) {
				x = a[i];
				y = i;
			}
		}
		return y;

	}

	static int min(int a[], int c) {
		int i;
		for (i = 0; i < a.length; i++) {
			if ((c > a[i]) && (a[i] > 0))
				c = a[i];
		}
		return c;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// System.out.println("enter the no of elements");
		int n = in.nextInt();

		// System.out.println("enter the elements");
		int a[] = new int[n];
		int i, y = 0, z = 0;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		// int b[]=new int [n];
		// for(i=0;i<n;i++)
		// b[i]=in.nextInt();
		int j, q = 0;
		y = max(a);
		for (j = 0; j < 100000; j++) {
			q = count(a);

			if (q == 0)
				break;
			System.out.println(q);
			z = min(a, a[y]);
			// System.out.println("minimum is :"+z);
			// System.out.println("maximum is :"+a[y]);
			for (i = 0; i < n; i++) {
				a[i] = a[i] - z;
				if (a[i] < 0)
					a[i] = 0;
			}

			// for(i=0;i<n;i++)
			// {
			// System.out.print(a[i]+" ");
			// }
			// System.out.println("");

		}
	}
}
