package service.lane;

import java.util.Scanner;

public class ServiceLane {

	static void min(int a[], int b, int c) {
		int min;
		min = a[b];
		for (int i = b; i <= c; i++)
			if (min > a[i])
				min = a[i];
		System.out.println(min);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int width[] = new int[n];
		for (int i = 0; i < n; i++)
			width[i] = in.nextInt();
		for (int x = 0; x < t; x++) {
			int i = in.nextInt();
			int j = in.nextInt();
			min(width, i, j);
		}

	}
}
