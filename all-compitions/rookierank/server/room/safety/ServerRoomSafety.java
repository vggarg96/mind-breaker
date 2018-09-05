package server.room.safety;

import java.util.Scanner;

public class ServerRoomSafety {

  	static int left(int n, int p[], int h[]) {
		int i = 0, j = 1;
		while (j < n) {
			if (i == j)
				return 0;
			if (h[i] + p[i] < p[j]) {
				i++;
				continue;
			}
			j++;
		}
		return 1;
	}

	static int right(int n, int p[], int h[]) {
		int i = n - 1, j = n - 2;
		while (j >= 0) {
			if (i == j)
				return 0;
			if (p[i] - h[i] <= p[j] || h[i] - p[i] > p[j]) {
				j--;
				continue;
			} else {
				i--;
				continue;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p[] = new int[n];
		int h[] = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = in.nextInt();
		for (int i = 0; i < n; i++)
			h[i] = in.nextInt();
		int x = left(n, p, h);
		int c = right(n, p, h);
		if (x == 1 && x == 1)
			System.out.println("BOTH");
		else if (x == 0 && c == 1)
			System.out.println("RIGHT");
		else if (x == 1 && c == 0)
			System.out.println("LEFT");
		else
			System.out.println("NONE");

	}

}
