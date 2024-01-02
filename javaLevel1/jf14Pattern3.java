package javaLevel1;

import java.util.Scanner;

public class jf14Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		System.out.print("Enter the col: ");
		int col = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = col; j>=0; j--) {
				
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
