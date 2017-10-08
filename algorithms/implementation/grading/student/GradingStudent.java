package grading.student;

import java.util.Scanner;

public class GradingStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n, x, y, z, w;
		n = in.nextInt();
		int input[] = new int[n];
		for (i = 0; i < n; i++) {
			input[i] = in.nextInt();
		}
		int output[] = new int[n];
		for (i = 0; i < n; i++) {
			x = input[i];
			if (x < 38) {
				output[i] = x;
			} else if ((x % 10) > 0) {
				y = x % 10;
				if ((10 - y) < 3) {
					z = 10 - y;
					output[i] = input[i] + z;
				} else if ((y < 5) && ((5 - y) < 3)) {
					w = 5 - y;
					output[i] = input[i] + w;
				} else {
					output[i] = input[i];
				}
			} else {
				output[i] = input[i];
			}
		}
		for (i = 0; i < n; i++) {
			System.out.println(output[i]);
		}
		in.close();
	}
}
