package javaLevel1;

import java.util.Scanner;

public class jf19Pattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		
		for(int i=row;i>0;i--) {
			for(int j=0;j<=i;j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
