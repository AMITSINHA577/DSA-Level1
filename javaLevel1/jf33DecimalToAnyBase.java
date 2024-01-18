package javaLevel1;

public class jf33DecimalToAnyBase {

	public static void main(String[] args) {

		int num = 634; // base 10
		int base = 8; // convert to base 8

		int rev = 0;
		int p = 1;
		while (num != 0) {
			int dig = num % base;
			num /= base;

			rev += dig * p;
			p = p * 10;
		}
		System.out.println(rev);

	}

}
