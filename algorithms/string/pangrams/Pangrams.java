package pangrams;

import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int i;
		boolean a[] = new boolean[26];
		for (i = 0; i < s.length(); i++) {
			int x = (int) s.charAt(i);
			if ((x >= 65) && (x <= 90)) {
				x = x - 65;
				a[x] = true;
			} else if ((x >= 97) && (x <= 122)) {
				x = x - 97;
				a[x] = true;
			}
		}
		int flag = 1;
		int t = 0;
		while (t < a.length) {
			if (a[t] == false)
				flag = 0;
			t++;
		}
		if (flag == 0)
			System.out.println("not pangram");
		else
			System.out.println("pangram");
	}
}
