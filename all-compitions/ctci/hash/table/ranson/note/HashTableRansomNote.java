package hash.table.ranson.note;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableRansomNote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int k = 0;
		// Map<String, String> note = new HashMap<String, String>();
		Hashtable<String, Integer> nm = new Hashtable<String, Integer>();
		for (int i = 0; i < m; i++) {
			String s = in.next();
			if (nm.containsKey(s))
				nm.put(s, nm.get(s) + 1);
			else
				nm.put(s, 1);
		}
		int f = 0;
		for (int i = 0; i < n; i++) {
			String s = in.next();
			if (nm.get(s) == null) {
				f = 1;
				break;
			}
			int c = nm.get(s) - 1;
			nm.put(s, c);
			if (c == 0)
				nm.remove(s);
		}
		if (f == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
