package a.race.against.time;

import java.util.Scanner;

public class ARaceAgainstTime {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b[] = new int[n - 1];
		int pi[] = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			b[i] = in.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			pi[i] = in.nextInt();
		}
		int p = n;
		for (int i = 0; i < n - 1; i++) {
			if (b[i] > a) {
				p += b[i] - a;
				p += pi[i];
				a = b[i];
//			} else if ((b[i] < a) && (pi[i] < (b[i] - a))) {
//				p += pi[i];
//				p += a - b[i];
			}
		}
		System.out.println(p++);
	}
}
