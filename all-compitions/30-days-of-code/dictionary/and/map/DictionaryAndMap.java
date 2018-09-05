package dictionary.and.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryAndMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, String> dic = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			String a = in.next();
			dic.put(s, a);
		}
		String a = in.next();
		while (a != null) {
			String s = dic.get(a);
			if (s == null)
				System.out.println("Not found");
			else
				System.out.println(a + "=" + s);
			a = in.next();
		}
	}
}
