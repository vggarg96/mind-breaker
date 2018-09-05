package caesar.Cipher;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/linkedin-practice-caesar-cipher/submissions/code/67897011
public class CaesarCipher {

	static String caesarCipher(String s, int k) {
		String q = "";
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) < 97 || s.charAt(i) > 122) && (s.charAt(i) < 65 || s.charAt(i) > 90))
				q = q + s.charAt(i);
			else if (s.charAt(i) >= 97) {
				int z = (int) s.charAt(i) + k;
				while (z > 122)
					z = z % 122 + 96;
				q = q + (char) z;
			}

			else {
				int z = (int) s.charAt(i) + k;
				while (z > 90)
					z = z % 90 + 64;
				q = q + (char) z;
			}
		}
		return q;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println((int) 'Z');
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		String result = caesarCipher(s, k);
		System.out.println(result);
		in.close();
	}
}
