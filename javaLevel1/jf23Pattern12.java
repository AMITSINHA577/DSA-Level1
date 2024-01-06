package javaLevel1;

import java.util.Scanner;

public class jf23Pattern12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		
		int a=0;
		int b=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(a+" ");
				int c = a+b;
				a = b;
				b = c;
			}
			System.out.println();
			
		}
	}

}
