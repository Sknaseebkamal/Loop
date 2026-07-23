package loop;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
			// TODO Autogit add -generated method stub
			System.out.println("enter number of row");
			int n= new Scanner(System.in).nextInt();
			for(int i=1;i<=n;i++) {
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					if(j==1 || j==i||i==n)
						System.out.print("*");
					else
					 	System.out.print(" ");
				}
				System.out.println();
			}
		}
}