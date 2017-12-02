package patterns;

public class P1 {
	public static void main(String args[]) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 6; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}	System.out.println();
			
		}
	}
	// TODO Auto-generated constructor stub
}
