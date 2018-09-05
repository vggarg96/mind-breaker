package p1;

import java.util.Scanner;

public class P1 {
	static long sum(long a,long x) {
		long s=0;
		long l=x-x%a;
		long n=x/a;
		s=(n*(a+l))/2;
		return s;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++) {
			long z=in.nextLong();
			z--;
			long s1=sum(3,z);
			long s2=sum(5,z);
			long s3=sum(15,z);
			System.out.println(s1+s2-s3);
		}
	}
}
