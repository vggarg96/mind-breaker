package quicksort1.partition;

import java.util.Scanner;

public class Quicksort1Partition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		String left = "", equal = "", right = "";
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		int p = a[0];
		equal += p + " ";
		for (int i = 1; i < n; i++) {
			if (p > a[i])
				left += a[i] + " ";
			else if (p < a[i])
				right += a[i] + " ";
			else
				equal += a[i] + " ";
		}
		System.out.println(left + equal + right);

	}

}
