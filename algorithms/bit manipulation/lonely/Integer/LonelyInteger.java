package lonely.Integer;

import java.util.Scanner;

public class LonelyInteger {

	static int lonelyinteger(int[] a) {
        int z=a[0];
        if(a.length==1)
            return a[0];
        else{
            for(int i=1;i<a.length;i++)
                z=z^a[i];
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
