package loop;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		
			System.out.println("enter number of row");
			int n= new Scanner(System.in).nextInt();


			for(int i=n;i>=1;i--) {
				int k=n-i+1;
				for(int j=i;j>=1;j--) {
				
						System.out.print(k);
	
				}
				System.out.println();
			}
		}

	}


