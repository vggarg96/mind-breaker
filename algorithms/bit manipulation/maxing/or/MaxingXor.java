package maxing.or;

import java.util.Scanner;

public class MaxingXor {

	static int maximizingXor(int l, int r) {
        int z=0;
        for(int i=l;i<=r;i++){
            for(int j=i+1;j<=r;j++)
                if((i^j)>z)
                    z=i^j;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
}
