package strong.password;

import java.util.Scanner;

public class StrongPassword {
	
	static int num(String s) {
		for (int i = 0; i < s.length(); i++) {
			if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)
				return 0;
		}
		return 1;
	}

	static int upca(String s) {
		for (int i = 0; i < s.length(); i++) {
			if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122)
				return 0;
		}
		return 1;
	}

	static int lwca(String s) {
		for (int i = 0; i < s.length(); i++) {
			if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
				return 0;
		}
		return 1;
	}

	static int sym(String s) {
		for (int i = 0; i < s.length(); i++) {
			char q = s.charAt(i);
			if (((int) q >= 33 && (int) q <= 45 && (int) q != 34 && (int) q != 39 && (int) q != 44) || (int) q == 64
					|| (int) q == 94)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int z = num(s);
		int x = upca(s);
		int c = lwca(s);
		int v = sym(s);
		int t = z + x + c + v;
		if (s.length() + t < 6) {
			t += 6 - s.length() - t;
		}
		System.out.println(t);
	}
}
