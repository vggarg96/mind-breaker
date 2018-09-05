package highest.value.palindrom;

import java.util.Scanner;

public class HighestValuePalindrom {

	static int pali(String s) {
		for (int i = 0, j = s.length() - 1; i < s.length() / 2 + 1; i++, j--)
			if (s.charAt(i) != s.charAt(j))
				return -1;
		return 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		char c = '9';
		int f = 0;
		String a = "";
		if (pali(s) == 1) {
			for (int i = 0, j = s.length() - 1; i < s.length() / 2 + 1; i++, j--) {
				if (k > 0) {
					if (s.charAt(i) != '9') {
						a = s.substring(0, i);
						a += "9";
						a += s.substring(i + 1);
						s = a;
						k--;
					}
					if (s.charAt(j) != '9') {
						a = s.substring(0, j);
						a += "9";
						a += s.substring(j + 1);
						s = a;
						k--;
					}
				}
			}
		} else {
			for (int i = 0, j = s.length() - 1; i < s.length() / 2 + 1; i++, j--) {
				if (i == j && k != 0) {
					a = s.substring(0, i);
					a += "9";
					a += s.substring(i + 1);
					s = a;
					k--;
				}
				if (k == 0) {

					if (s.charAt(i) != s.charAt(j)) {
						System.out.println("-1");
						f = 1;
						break;
					}
				} else if (k == 1) {
					if (s.charAt(i) != s.charAt(j)) {
						if (s.charAt(i) > s.charAt(j)) {
							a = s.substring(0, j);
							a += s.charAt(i);
							a += s.substring(j + 1);
							s = a;
							// System.out.println(s);
						} else {
							a = s.substring(0, i);
							a += s.charAt(j);
							a += s.substring(i + 1);
							s = a;
						}
						k--;
					}
				} else {
					if (s.charAt(i) != s.charAt(j)) {
						if (s.charAt(i) != '9') {
							a = s.substring(0, i);
							a += "9";
							a += s.substring(i + 1);
							s = a;
							k--;
						}
						if (s.charAt(j) != '9') {
							a = s.substring(0, j);
							a += "9";
							a += s.substring(j + 1);
							s = a;
							k--;
						}
					}
				}
			}
		}
		if (f == 0)
			System.out.println(s);
	}
}
