package algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.*;

public class p3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//int a[] = new int[n];
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			a.add(in.next());
		int p = in.nextInt();
		int q=a.size();
		int count = 0, j = 0;
//		while (a[p] > 0) {
//			if (a[j] <= 0) {
//				j++;
//				continue;
//			}
////			count++;
//			a[j++]--;
//			if(j==a.length)
//				j=0;
//		}
		System.out.println(count);
	}

}
