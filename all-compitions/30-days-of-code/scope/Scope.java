package scope;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int a[]) {
		elements = a;
	}

	int min(int q[]) {
		int x = q[0];
		for (int i = 0; i < q.length; i++)
			if (x > q[i])
				x = q[i];
		return x;
	}

	int max(int q[]) {
		int x = q[0];
		for (int i = 0; i < q.length; i++)
			if (x < q[i])
				x = q[i];
		return x;
	}

	void computeDifference() {
		int a = min(elements);
		int b = max(elements);
		maximumDifference = b - a;
	}
} // End of Difference class

public class Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
