package caeser.cipher;

import java.util.Scanner;

public class CaeserCipher {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		int i;
		char c[] = new char[n];
		for (i = 0; i < n; i++) {
			int x = (int) s.charAt(i);
			// if(((x>=65)&&(x<=90))||((x>=97)&&(x<=122)))
			if ((x >= 65) && (x <= 90)) {
				x = x + k;
				while (x > 90)
					x = x % 90 + 64;
				c[i] = (char) x;
			} else if ((x >= 97) && (x <= 122)) {
				x = x + k;
				while (x > 122)
					x = x % 122 + 96;
				c[i] = (char) x;
			} else {
				c[i] = (char) x;
			}
		}
		for (i = 0; i < n; i++)
			System.out.print(c[i]);
	}
}
