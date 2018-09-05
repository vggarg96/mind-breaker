package sting2;
//https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places/0
import java.util.Scanner;

public class String2 {

	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    String a=in.next();
		    String b=in.next();
		    String c,d;
		    c=a.substring(2)+a.substring(0, 2);
		    d=a.substring(a.length()-2)+a.substring(0, a.length()-2);
		    System.out.println(c+"  "+d);
		    if(c.equals(b)||d.equals(b))
		    	System.out.println("1");
		    else
		    	System.out.println("0");
		}
	}
}
