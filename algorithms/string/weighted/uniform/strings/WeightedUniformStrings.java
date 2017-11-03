package weighted.uniform.strings;

import java.util.Scanner;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(s.length());
		int n = in.nextInt();
		int c[] = new int[27];
		char a = s.charAt(0);
		c[(int) a - 96]++;
		int q = 0;
		for (int j = 1; j < s.length(); j++) {
			char z = s.charAt(j);
			if (z == a)
				c[(int) a - 96]++;
			else if (c[(int) z - 96] == 0)
				c[(int) z - 96]++;
			else if (c[(int) z - 96] != 0) {
				if (z != a)
					q = 0;
				q++;
				if (c[(int) z - 96] < q)
					c[(int) z - 96] = q;
			}
			a = z;
		}
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (x < 2600001) {
				int z = check(c, x);
				if (z == 1)
					System.out.println("yes");
				else
					System.out.println("no");
			} else
				System.out.println("No");
		}
	}

	static int check(int c[], int x) {
		int v = 0;
		for (int i = 1; i <= 26; i++) {
			if (c[i] == 0)
				continue;
			if ((x % i == 0) && (c[i] >= x / i)) {
				v = 1;
				break;
			}
		}
		if (v == 1)
			return 1;
		else
			return 0;
	}
}