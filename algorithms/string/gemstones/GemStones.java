package gemstones;

import java.util.Scanner;

public class GemStones {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = 0;
		int a[] = new int[26];
		for (int i = 0; i < n; i++) {
			String s = in.next();
			for (int j = 0; j < s.length(); j++) {
				int x = (int) s.charAt(j) - 97;
				if (a[x] == i) {
					a[x]++;
					if (a[x] == n)
						c++;
				}
			}
		}
		System.out.println(c);
	}
}
