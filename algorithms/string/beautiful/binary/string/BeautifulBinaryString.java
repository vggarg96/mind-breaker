package beautiful.binary.string;

import java.util.Scanner;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		String a = "010";
		int i = 0, j = 0, c = 0;
		while (i < s.length()) {
			if (s.charAt(i) == a.charAt(j)) {
				i++;
				j++;
				if (j == a.length()) {
					c++;
					j = 0;
				}

			} else {
				if (j == 1)
					i--;
				j = 0;
				i++;
			}
		}
		System.out.println(c);
	}

}
