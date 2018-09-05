package insertion.sort.part1;

import java.util.Scanner;

public class InsertionSort1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int a[] = new int[s];
		for (int i = 0; i < s; i++) {
			a[i] = in.nextInt();
		}
		insertIntoSorted(a);
	}

	private static void printArray(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void insertIntoSorted(int[] a) {
		int e, j;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] < a[i])
				continue;
			else {
				e = a[i];
				j = i;
				while (true) {
					if (j == 0) {
						a[0] = e;
						printArray(a);
						break;
					}
					if (e > a[j - 1]) {
						a[j] = e;
						printArray(a);
						break;
					} else {
						a[j] = a[j - 1];
						printArray(a);
					}
					j--;
				}
			}
		}
	}

}
