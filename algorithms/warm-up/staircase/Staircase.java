package staircase;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, j;
		n = in.nextInt();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j >= (n - 1 - i))
					System.out.print("#");
				else
					System.out.print("\t");
			}
			System.out.println("");
		}

	}
}
