package loop;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter number of row");
		int n= new Scanner(System.in).nextInt();
//		int num=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				int k=n*i;
				for(int j=1;j<=n;j++) {
					System.out.print(k+"\t");
					k--;
				}
			}
			else {
				int k=((i-1)*n)+1;
			for(int j=1;j<=n;j++) {
				System.out.print(k +"\t");
				k++;
			}}
			System.out.println();
		
	}
}	
}
