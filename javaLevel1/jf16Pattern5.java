package javaLevel1;

import java.util.Scanner;

public class jf16Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		
//		upper diamond patten
		
		for (int i = 0; i < row; i++) {
			
			for(int j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		lower diamond patten
		
		for (int i = row; i >= 0; i--) {
			
			for(int j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
