package javaLevel1;

import java.util.Scanner;

public class jf7RotateANumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of arr: ");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("enter the number of rotate: ");
		int numRotate = sc.nextInt();
		
		if(numRotate < 0) {
			numRotate = arr.length + numRotate;
		}
		
		for(int i=0;i<numRotate;i++) {
			int frist = arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = frist;
		}
		
		for(int temp = 0;temp<arr.length;temp++) {
			System.out.print(arr[temp]+" ");
		}
	}
}
