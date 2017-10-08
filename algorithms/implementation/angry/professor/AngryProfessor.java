package angry.professor;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// System.out.println("enter the no of cases");
		int n = s.nextInt();
		// System.out.println("enter no of students, thresold no & student arrival
		// time");
		int i, j;
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[10000 * n];
		int y;
		for (i = 0; i < n; i++) {

			a[i] = s.nextInt();
			b[i] = s.nextInt();
			y = 10 * i * a[i];
			for (j = 0; j < a[i]; j++) {
				c[j + y] = s.nextInt();
			}
		}
		int count[] = new int[n];
		for (i = 0; i < n; i++) {
			y = 10 * i * a[i];
			for (j = 0; j < a[i]; j++) {

				if (c[j + y] <= 0) {
					count[i]++;
				}
			}
		}
		for (i = 0; i < n; i++) {
			if (count[i] >= b[i]) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
