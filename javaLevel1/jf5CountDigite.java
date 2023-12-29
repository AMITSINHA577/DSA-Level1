package javaLevel1;

import java.util.Scanner;

public class jf5CountDigite {

	public static void countDigite(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}System.out.println("count to digite is "+ count);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int num = sc.nextInt();
		countDigite(num);
	}

}
