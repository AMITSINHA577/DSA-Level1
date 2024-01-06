package javaLevel1;

import java.util.Scanner;

public class jf25Pattern14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Table Number: ");
		int tableNum = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(tableNum +" * "+ i +" = "+ tableNum*i);
		}
		
		
	}

}
