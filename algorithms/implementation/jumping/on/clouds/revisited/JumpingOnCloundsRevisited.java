package jumping.on.clouds.revisited;

import java.util.Scanner;

public class JumpingOnCloundsRevisited {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of clouds");
		int n = in.nextInt();
		// System.out.println("enter the key jump");
		int k = in.nextInt();
		// System.out.println("enter the cloud details");
		int a[] = new int[n];
		int i, e = 100;
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		i = 0;
		do {
			e--;
			if (a[i] == 1) {
				e = e - 2;
			}
			i = (i + k) % n;
		} while (i != 0);
		System.out.println(e);
	}
}
