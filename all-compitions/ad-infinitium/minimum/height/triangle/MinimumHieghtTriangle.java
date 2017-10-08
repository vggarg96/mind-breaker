package minimum.height.triangle;

import java.util.Scanner;

public class MinimumHieghtTriangle {
	static int lowestTriangle(int base, int area) {
		int h;
		h = 2 * area / base;
		if ((base * h / 2) >= area)
			return h;
		else
			return h + 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base = in.nextInt();
		int area = in.nextInt();
		int height = lowestTriangle(base, area);
		System.out.println(height);
	}
}
