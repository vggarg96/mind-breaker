package lets.review;

import java.util.Scanner;

public class LetsReview {
	static void result(String s) {
		int i;
		String even = "", odd = "";
		for (i = 0; i < s.length(); i++) {
			if (i % 2 == 0)
				even = even + s.charAt(i);
			else
				odd = odd + s.charAt(i);
		}
		System.out.println(even + " " + odd);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s;
		for (int i = 0; i < n; i++) {
			s = in.next();
			result(s);
		}
	}
}
