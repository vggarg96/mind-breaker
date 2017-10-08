package append.and.delete;

import java.util.Scanner;

public class AppendAndDelete {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		char a[] = new char[s.length()];
		char b[] = new char[t.length()];
		a = s.toCharArray();
		b = t.toCharArray();
		int i = 0, count = 0;
		while ((i < a.length) && (i < b.length)) {
			if (a[i] == b[i]) {
				count++;
				i++;
			} else
				break;
		}
		int x = 0;
		x = a.length - count;
		x += b.length - count;
		if (x == k)
			System.out.println("Yes");
		else if ((k > x) && (count != 0)) {
			if (x == 0)
				System.out.println("Yes");
			else if ((k - x) % 2 == 0)
				System.out.println("Yes");
			else if (((k - x) % 2 != 0) && ((k <= a.length) || (k <= b.length)))
				System.out.println("No");
			else if ((k > a.length) && (k > b.length))
				if ((a.length + b.length - k - count) % 2 == 0)
					System.out.println("Yes");
				else
					System.out.println("No");
		} else if ((k > x) && (count == 0)) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}
}
