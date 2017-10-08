package intro.to.tutorial.challenges;

import java.util.Scanner;

public class IntroToTutorialChallenges {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int i = 0;
		while (a[i] != k) {
			i++;
		}
		System.out.println(i);
	}
}
