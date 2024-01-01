package javaLevel1;

public class jf10PythagoreanTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 3;
		int c = 4;
		
		if(a>b && a>c) {
			int temp1 = (b*b)+(c*c);
			int temp2 = a*a;
			if(temp1==temp2) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}else if(b>a && b>c) {
			int temp1 = (a*a)+(c*c);
			int temp2 = b*b;
			if(temp1==temp2) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}else if(c>a && c>b) {
			int temp1 = (a*a)+(b*b);
			int temp2 = c*c;
			if(temp1==temp2) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}

	}

}
