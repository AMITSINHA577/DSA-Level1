package javaLevel1;

import java.util.Scanner;

public class jf22Pattern11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		int count =1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			
		}
	}

}
