package javaLevel1;

import java.util.Scanner;

public class jf18Pattern7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++) {
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
