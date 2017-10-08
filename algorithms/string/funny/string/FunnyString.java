package funny.string;

import java.util.Scanner;

public class FunnyString {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int j = 0; j < n; j++) {
			String s = in.next();
			char st[] = s.toCharArray();
			char rt[] = new char[s.length()];
			int k = 0, i = s.length() - 1;
			while (i >= 0) {
				rt[k++] = st[i--];
			}
			int flag = 1;
			int x = 0, y = 0;
			for (i = 1; i < st.length; i++) {
				x = st[i] - st[i - 1];
				y = rt[i] - rt[i - 1];
				if (x < 0)
					x = -x;
				if (y < 0)
					y = -y;
				if (x != y)
					flag = 0;
			}
			if (flag == 0) {
				System.out.println("Not Funny");
			} else
				System.out.println("Funny");
		}
	}
}
