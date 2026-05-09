package loop;

import java.util.Scanner;

public class Pattern9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of row");
		int n= new Scanner(System.in).nextInt();

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||((i+j)==(n+1)))
				System.out.print("*");
				
				
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
