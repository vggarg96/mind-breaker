package summer.lesson;

import java.util.Scanner;

public class SummerLesson {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[]=new int[m];
        for(int i=0;i<n;i++)
        {
            int z=in.nextInt();
            a[z]++;
        }
        for(int i=0;i<m;i++)
            System.out.print(a[i]+" ");
    }
}
