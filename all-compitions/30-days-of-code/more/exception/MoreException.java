package more.exception;

import java.util.Scanner;

class Calculator {
	int power(int n, int p) throws Exception {
		int ans = n;
		if (p == 0)
			ans = 1;
		if (n < 0 || p < 0)
			throw new Exception("n and p should be non-negative");
		for (int i = 1; i < p; i++)
			ans *= n;

		return ans;
	}
}

public class MoreException {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}

}
