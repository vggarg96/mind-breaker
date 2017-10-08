package sherlock.and.square;

import java.util.Scanner;

public class SherlockAndSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of cases");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int s = in.nextInt();
			int l = in.nextInt();
			int count = 0;
			int j = (int) Math.sqrt(s);
			while (j * j <= l) {
				if ((j * j <= l) && (j * j >= s))
					count++;
				j++;
			}
			System.out.println(count);
		}
	}
}
