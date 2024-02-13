package javaLevel1;

import java.util.Scanner;

public class jf43BarChart {

	public static int findMaxNum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void barChart(int[] arr, int maxNum) {

		for (int floor = maxNum; floor >= 1; floor--) {

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= floor) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter the element: ");
			arr[i] = sc.nextInt();
		}

		barChart(arr, findMaxNum(arr));

	}

}
