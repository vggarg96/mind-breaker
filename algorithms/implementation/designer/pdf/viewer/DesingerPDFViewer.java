package designer.pdf.viewer;

import java.util.Scanner;

public class DesingerPDFViewer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("read the string");
		String s;
		int i;
		int height[] = new int[26];
		for (i = 0; i < 26; i++) {
			height[i] = in.nextInt();
		}
		// int n=10;
		s = in.next();
		int n = s.length();
		int f[] = new int[n];
		char c[] = new char[n];
		c = s.toCharArray();
		// for (i = 0; i < n; i++) {
		// System.out.println(c[i]);
		// }
		for (i = 0; i < n; i++) {
			int y = (int) c[i];
			f[i] = y - 97;
			// System.out.println(c[i]+"\t"+f[i]);
		}
		// for(i=0;i<n;i++)
		// {
		// System.out.println(c[i]+"\t"+height[f[i]]);
		// }
		int z = height[0];
		// System.out.println(z);
		for (i = 1; i < n; i++) {
			if (z < height[f[i]]) {
				z = height[f[i]];
				// System.out.println( + z);
			}
		}
		// System.out.println(z);
		System.out.println(+n * z);
		// for(i=0;i<n;i++)
		// {
		// System.out.println(c[i]+"\t"+height[i]);
		// }
	}
}
