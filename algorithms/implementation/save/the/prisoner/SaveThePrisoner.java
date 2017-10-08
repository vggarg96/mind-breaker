package save.the.prisoner;

import java.util.Scanner;

public class SaveThePrisoner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of cases");
		int t = in.nextInt();
		int n[] = new int[t];
		int m[] = new int[t];
		int id[] = new int[t];
		int i;
		for (i = 0; i < t; i++) {
			n[i] = in.nextInt();
			m[i] = in.nextInt();
			id[i] = in.nextInt();
		}
		int res[] = new int[t];
		for (i = 0; i < t; i++) {
			if (((id[i] + m[i] - 1) % n[i]) == 0) {
				res[i] = n[i];
			} else {
				res[i] = (id[i] + m[i] - 1) % n[i];
				if (res[i] > m[i]) {
					res[i] = res[i] % m[i] + 1;
				}
			}
			System.out.println(res[i]);
		}
	}
}
