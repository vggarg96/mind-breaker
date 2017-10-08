package correctnessandthe.loop.lnvariant;

import java.util.Scanner;

public class CorrectnessAndTheLoopInvariant {
	public static void insertionSort(int[] a) {
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
						break;
					}
					if (e > a[j - 1]) {
						a[j] = e;
						break;
					} else
						a[j] = a[j - 1];
					j--;
				}
			}
		}
		printArray(a);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);
	}
}
