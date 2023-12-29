package javaLevel1;

import java.util.Scanner;

public class jf2Prime {

	public static boolean isPrime(int num) {
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num+" is a prime number");
		}else {

			System.out.println(num+" is a not prime number");
		}
	}

}
