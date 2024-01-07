package javaLevel1;

import java.util.Scanner;

public class jf28Pattern17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();

		int sp = row / 2;
		int st = 1;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < sp; j++) {

				if (i == row / 2) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}

			for (int j = 0; j < st; j++) {
				System.out.print("* ");
			}

			if (i < row / 2) {
				st++;
			} else {
				st--;
			}
			System.out.println();
		}

	}

}
