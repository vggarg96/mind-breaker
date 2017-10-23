package hackerland.radio.transmittor;

import java.util.Scanner;

public class HackerlandRadioTransmittor {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[100001];
		int z = 0, m = 0, v;
		for (int i = 0; i < n; i++) {
			v = in.nextInt();
			a[v] = 1;
			if (z > v)
				z = v;
			if (m < v)
				m = v;
		}
		int x = z + k;
		while (true) {
			if (a[x] == 0) {
				while (a[x] == 0)
					x--;
			}
		}
	}
}
