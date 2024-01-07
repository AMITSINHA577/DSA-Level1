package javaLevel1;

import java.util.Scanner;

public class jf29Pattern18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = sc.nextInt();

		int st = row;
		int sp = 0;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}

			for (int j = 0; j < st; j++) {

				if (i > 0 && i < row / 2 && j > 0 && j < st-1) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}

			if (i < row / 2) {
				sp++;
				st -= 2;
			} else {
				sp--;
				st += 2;
			}

			System.out.println();

		}

	}

}
