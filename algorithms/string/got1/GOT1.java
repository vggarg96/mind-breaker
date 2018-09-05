package got1;

import java.util.Scanner;

public class GOT1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int c[] = new int[26];
		int x = 1, f = 1;
		if (s.length() % 2 == 0) {
			x = 0;
		}
		for (int i = 0; i < s.length(); i++)
			c[(int) s.charAt(i) - 97]++;
		for (int i = 0; i < 26; i++) {
			if (c[i] % 2 != 0 && x == 1) {
				x = 0;
			} else if (c[i] % 2 != 0) {
				f = 0;
				break;
			}
		}
		if (f == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
