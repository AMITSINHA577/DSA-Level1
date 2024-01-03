package javaLevel1;

import java.util.Scanner;

public class jf15Pattern4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		System.out.print("Enter the col: ");
		int col = sc.nextInt();

		for (int i = 0; i < row; i++) {
			
			for(int j=1;j<=row;j++) {
				
				if(i==j || i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
}
