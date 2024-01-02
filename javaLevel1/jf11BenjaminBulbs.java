package javaLevel1;

import java.util.Scanner;

public class jf11BenjaminBulbs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n number: ");
		int n = sc.nextInt();
		for (int i = 1; i * i <= n; i++) {
			System.out.println(i * i);
		}
	}

}
