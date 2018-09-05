package bool.mat;

import java.util.Scanner;

public class BoolMat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int k = 0; k < t; k++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int x = in.nextInt();
					if (x == 0)
						continue;
					else {
						for (int q = 0; q < n; q++)
							a[q][j] = 1;
						for (int q = 0; q < m; q++)
							a[i][q] = 1;
					}
				}
			}
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					System.out.print(a[i][j] + " ");
			System.out.println("");
		}
	}

}
