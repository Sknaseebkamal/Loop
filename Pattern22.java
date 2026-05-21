package loop;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		System.out.println("enter number of row");
		int n= new Scanner(System.in).nextInt();


		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				if(j==1 || j==i||i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
