package loop;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter number of row");
			int n= new Scanner(System.in).nextInt();
			for(int i=1;i<=n;i++) {
				int m=i;
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(m);
					m--;
				}
				System.out.println();
			}
		}

	}


