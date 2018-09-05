package string.construction;

import java.util.Scanner;

public class StringConstruction {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String a = in.next();
			String s = "";
			int c = 0;
			for (int j = 0; j < a.length(); j++) {
				String z = "" + a.charAt(j);
				if (s.contains(z)) {
					while (s.contains(z)) {
						if (j + 1 < a.length())
							z += "" + a.charAt(++j);
						else {
							s += z;
							break;
						}
					}
				} else {
					c++;
					s += z;
				}
			}
			System.out.println(c);
		}
	}
}
