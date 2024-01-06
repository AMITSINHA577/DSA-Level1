package javaLevel1;

import java.util.Scanner;

public class jf24Pattern13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++) {
			int icj = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(icj+" ");
				
				int icjp1 = icj * (i-j)/(j+1);
				icj = icjp1;
			}
			System.out.println();
		}
	}

}
