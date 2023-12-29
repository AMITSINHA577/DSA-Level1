package javaLevel1;

import java.util.Scanner;

public class jf1PrintZ {
	
	public static void zPatten(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || i+j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row number:");
		int n = sc.nextInt();
		zPatten(n);
	}

}
