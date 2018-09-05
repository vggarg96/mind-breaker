package and.product;

import java.util.Scanner;

public class AndProduct {

	static long andProduct(long a, long b) {
	       long z=a;
	        for(long i=a;i<=b;i++)
	            z=z&i;
	        return z;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int a0 = 0; a0 < n; a0++){
	            long a = in.nextLong();
	            long b = in.nextLong();
	            long result = andProduct(a, b);
	            System.out.println(result);
	        }
	        in.close();
	    }
}
