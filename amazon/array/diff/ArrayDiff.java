package array.diff;

import java.util.Scanner;

public class ArrayDiff {

	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=in.nextInt();
		    }
		    int b[]=new int[n];
		    b[n-1]=-1;
		    for(int j=0;j<n-1;j++){
		        if(a[j]>a[j+1])
		            b[j]=a[j+1];
		        else
		            b[j]=-1;
		    }
            for(int j=0;j<n;j++){
                System.out.print(b[j]+" ");
            }
            System.out.print("");
		}
	}

}
