package javaLevel1;

import java.util.Scanner;

public class jf12Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		System.out.print("Enter the col: ");
		int col = sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
