package javaLevel1;

import java.util.Scanner;

public class jf42FindElement {

	public static void findElement(int arr[], int findNum) {

		for (int i=0;i<arr.length;i++) {
			if (findNum == arr[i]) {
				System.out.println(i);
				break;
			}
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

		System.out.println("enter the number u want to find: ");
		int find = sc.nextInt();
		
		findElement(arr, find);
	}

}
