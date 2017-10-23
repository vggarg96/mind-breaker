package data.types;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = scan.nextDouble();
		String sa = scan.next();
		String saa = scan.nextLine();
		sa = sa + "" + saa;
		s = s + sa;
		a = a + i;
		d = d + b;
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		scan.close();
	}
}
