package javaLevel1;

import java.util.Scanner;

public class jf44SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter the element: ");
			arr[i] = sc.nextInt();
		}

		System.out.println("enter the size of 2 array ");
		int size2 = sc.nextInt();

		int arr2[] = new int[size2];

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("enter the element: ");
			arr2[i] = sc.nextInt();
		}

		int[] sum = new int[size > size2 ? size : size2];

		int c = 0;
		int i = arr.length - 1;
		int j = arr2.length - 1;
		int k = sum.length - 1;

		while (k >= 0) {
			int d = c;
			if (i >= 0) {
				d += arr[i];
			}

			if (j >= 0) {
				d += arr2[j];
			}

			c = d / 10;
			d = d % 10;

			sum[k] = d;
			i--;
			j--;
			k--;
		}

		if (c != 0) {
			System.out.println(c);
		}

		for (int temp : sum) {
			System.out.println(temp);
		}

	}
}
