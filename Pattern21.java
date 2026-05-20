package loop;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of row");
		int n= new Scanner(System.in).nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
