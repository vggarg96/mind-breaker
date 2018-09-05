package forming.magic.square;

import java.math.*;
import java.util.Scanner;

public class FormingMagicSqaure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the matrix");
		int i, j;
		int r[][] = { { 8, 1, 6, 3, 5, 7, 4, 9, 2 }, { 4, 3, 8, 9, 5, 1, 2, 7, 6 }, { 2, 9, 4, 7, 5, 3, 6, 1, 8 },
				{ 6, 7, 2, 1, 5, 9, 8, 3, 4 }, { 6, 1, 8, 7, 5, 3, 2, 9, 4 }, { 8, 3, 4, 1, 5, 9, 6, 7, 2 },
				{ 4, 9, 2, 3, 5, 7, 8, 1, 6 }, { 2, 7, 6, 9, 5, 1, 4, 3, 8 } };
		int a[] = new int[9];
		for (i = 0; i < 9; i++) {
			a[i] = in.nextInt();
		}
		int sum[] = new int[8];
		for (i = 0; i < 8; i++) {
			for (j = 0; j < 9; j++) {
				if (a[j] != r[i][j])
					sum[i] = sum[i] + Math.abs(a[j] - r[i][j]);
			}
		}
		int count = sum[0];
		for (i = 1; i < sum.length; i++)
			if (count > sum[i])
				count = sum[i];
		System.out.println(count);
	}
}
