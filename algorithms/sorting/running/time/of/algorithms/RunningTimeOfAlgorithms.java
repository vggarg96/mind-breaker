package running.time.of.algorithms;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int a[] = new int[s];
		for (int i = 0; i < s; i++) {
			a[i] = in.nextInt();
		}
		insertIntoSorted(a);
	}

	public static void insertIntoSorted(int[] a) {
		int e, j, c = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] < a[i])
				continue;
			else {
				e = a[i];
				j = i;
				while (true) {
					if (j == 0) {
						a[0] = e;
						break;
					}
					if (e >= a[j - 1]) {
						a[j] = e;
						break;
					} else {
						a[j] = a[j - 1];
						c++;
					}
					j--;
				}
			}
		}
		System.out.println(c);
	}
}
