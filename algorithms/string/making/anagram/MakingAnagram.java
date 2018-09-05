package making.anagram;

import java.util.Scanner;

public class MakingAnagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String s = in.nextLine();
		int aa[] = new int[26];
		int ss[] = new int[26];
		// System.out.println((int) 'a');
		for (int i = 0; i < a.length(); i++) {
			int x = (int) a.charAt(i);
			aa[x - 97]++;
		}
		for (int i = 0; i < s.length(); i++) {
			int x = (int) s.charAt(i);
			ss[x - 97]++;
		}
		String n = "";
		for (int i = 0; i < 26; i++) {
			if (aa[i] != 0 && ss[i] != 0) {
				int y = aa[i] <= ss[i] ? aa[i] : ss[i];
				for (int j = 0; j < y; j++)
					n += (char) (i + 97);
			}
		}
		int z = a.length() + s.length() - 2 * n.length();
		System.out.println(z);
	}
}
