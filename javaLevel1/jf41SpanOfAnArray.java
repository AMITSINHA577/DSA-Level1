package javaLevel1;

import java.util.Scanner;

class maxOrMin {

	public static void findMax(int[] arr) {

		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}

			if (minNum > arr[i]) {
				minNum = arr[i];
			}
		}

		System.out.println(maxNum + " " + minNum);
		System.out.println(maxNum - minNum);
	}

}

public class jf41SpanOfAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter the element: ");
			arr[i] = sc.nextInt();
		}

		maxOrMin.findMax(arr);

//		for (int i : arr) {
//
//			System.out.print(i + " ");
//		}
	}

}
