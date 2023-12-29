package javaLevel1;

import java.util.Scanner;

public class jf3allPrime {
	
	public static void allPrime(int low, int high) {
		
		for(int i=low;i<high;i++) {
			int count=0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}if(count==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number: ");
		int low = sc.nextInt();
		System.out.println("enter ending number: ");
		int high = sc.nextInt();
		
		allPrime(low, high);

	}

}
