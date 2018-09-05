package the.love.letter.mystery;

import java.util.Scanner;

public class TheLoveLetterMystery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			int c = 0, k = s.length() - 1, j = 0;
			while (j <= k) {
				if ((int) s.charAt(j) > (int) s.charAt(k))
					c += (int) s.charAt(j++) - (int) s.charAt(k--);
				else
					c += (int) s.charAt(k--) - (int) s.charAt(j++);
			}
			System.out.println(c);
		}
	}

}
