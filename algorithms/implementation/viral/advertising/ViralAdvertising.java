package viral.advertising;

import java.util.Scanner;

public class ViralAdvertising {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of days");
		int n = in.nextInt();
		int i, s, like = 0, share = 0, count = 0;
		s = 5;
		for (i = 0; i < n; i++) {
			like = s / 2;
			count = count + like;
			share = like * 3;
			s = share;
		}
		System.out.println(count);
	}
}
