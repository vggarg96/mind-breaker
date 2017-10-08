package hard.questions;

import java.util.Scanner;

public class HardQuestions {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		String r = in.next();
		int c = 0, i = 0;
		while (i < n) {
			if ((s.charAt(i) != r.charAt(i)) && (s.charAt(i) != '.'))
				c++;
			i++;
		}
		System.out.println(c);
	}
}
