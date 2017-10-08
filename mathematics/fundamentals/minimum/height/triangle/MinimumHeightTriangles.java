package minimum.height.triangle;

import java.util.Scanner;

public class MinimumHeightTriangles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		int a = in.nextInt();
		int h;
		h = 2 * a / b;
		if (h * b / 2 >= a)
			h = h;
		else
			h = h + 1;
		System.out.println(h);
	}
}
