package javaLevel1;

import java.util.Scanner;

public class jf4Fibonacci {

	public static void fibonacciS(int num) {
		int m = 0;
		int n = 1;
//		System.out.println(m);
//		System.out.println(n);
		for(int i=2;i<num;i++) {
			System.out.println(m);
			int temp = m+n;
			m = n;
			n = temp;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		fibonacciS(num);

	}

}
