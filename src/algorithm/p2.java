package algorithm;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int f=0;
		String q[]=new String[t];
		// cob,ccb,scb.sob,fob,fcb
		for (int i = 0; i < t; i++) {
			int fb = 0, sb = 0, cb = 0;
			String s = in.next();
			f=0;
			String state = "first";
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '{') {
					state = "fob";
					if(fb>=0)
						fb++;
					else {
						q[i]="NO";
						break;
					}
				} else if (s.charAt(j) == '[') {
					state = "sob";
					if(sb>=0)
						sb++;
					else {
						q[i]="NO";
						break;
					}
				} else if (s.charAt(j) == '(') {
					state = "cob";
					if(cb>=0)
						cb++;
					else {
						System.out.println("NO");
						break;
					}
				} else if (s.charAt(j) == '}' && (state == "ccb" || state == "scb" || state == "fcb")
						|| state == "fob") {
					state = "fcb";
					fb--;
				} else if (s.charAt(j) == ']' && (state == "ccb" || state == "scb" || state == "fcb")
						|| state == "sob") {
					state = "scb";
					sb--;
				} else if (s.charAt(j) == ')' && (state == "ccb" || state == "scb" || state == "fcb")
						|| state == "cob") {
					state = "ccb";
					cb--;
				} else {
					System.out.println("NO");
					f=1;
					break;
				}
			}
			if (f==0 && fb == 0 && cb == 0 && sb == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
