package javaLevel1;

import java.util.Scanner;

public class jf30Pattern19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= row; j++) {

				if (i == 1) {

					if (j == row || j <= row / 2 + 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

				} else if (i <= row / 2) {

					if (j == row || j == row / 2 + 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

				} else if (i == row / 2 + 1) {

					System.out.print("* ");

				} else if (i < row) {

					if (j == 1 || j == row / 2 + 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

				} else {

					if (j == 1 || j >= row / 2 + 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

				}
			}
			System.out.println();
		}

	}

}
