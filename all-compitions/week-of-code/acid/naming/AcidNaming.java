package acid.naming;

import java.util.Scanner;

public class AcidNaming {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int q=in.nextInt();
		String a="ic",b="hydro";
		for(int i=0;i<q;i++)
		{
			String s=in.next();
			String z;
			String x=s.substring(s.length()-2);
			if(x.equals(a))
			{
				try 
				{
				z=s.substring(0, 5);
				}
				catch (Exception e) {
					z="";
				}
				if(z.equals(b))
					System.out.println("non-metal acid");
				else
					System.out.println("polyatomic acid");
			}
			else
				System.out.println("not an acid");
		}
	}
}
