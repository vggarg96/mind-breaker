package alternating.characters;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String s = in.next();
			int c = 0;
			for (int j = 1; j < s.length(); j++)
				if (s.charAt(j) == s.charAt(j - 1))
					c++;
			System.out.println(c);
		}
	}
}
