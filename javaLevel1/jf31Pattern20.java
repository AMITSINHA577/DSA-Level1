package javaLevel1;

import java.util.Scanner;

public class jf31Pattern20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= row; j++) {

				if (j == 1 || j == row) {
					System.out.print("* ");
				} else if (i > row / 2 && (i == j || i + j == row + 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
