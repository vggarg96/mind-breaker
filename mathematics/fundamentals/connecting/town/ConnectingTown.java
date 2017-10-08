package connecting.town;

import java.util.Scanner;

public class ConnectingTown {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int j = 0; j < t; j++) {
			int n = in.nextInt();
			double sum = 1;
			for (int i = 0; i < n - 1; i++) {
				int r = in.nextInt();
				sum = sum * r;
				sum = (int) sum % 1234567;
			}
			sum = (int) sum % 1234567;
			System.out.println((int) sum);
		}
	}
}
