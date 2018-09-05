package counting.sort2;

import java.util.Scanner;

public class CountingSort2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[100];
		int j = 0;
		for (int i = 0; i < n; i++) {
			j = in.nextInt();
			a[j]++;
		}
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				for (j = 0; j < a[i]; j++)
					System.out.print(i + " ");
			}
		}
	}
}
