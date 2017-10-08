package mars.exploration;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n;
		n = s.length();
		char c[] = { 'S', 'O', 'S' };
		int k = 0, count = 0, x = 0;
		while (k < n) {
			if (c[x] == s.charAt(k)) {
				k++;
				x++;
			} else {
				count++;
				k++;
				x++;
			}
			x = x % 3;
		}
		System.out.println(count);
	}
}
