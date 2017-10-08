package counting.sort1;

import java.util.Scanner;

public class CountingSort1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[100];
		int j;
		for (int i = 0; i < n; i++) {
			j = in.nextInt();
			a[j]++;
		}
		for (int i = 0; i < 100; i++)
			System.out.print(a[i] + " ");
	}
}
