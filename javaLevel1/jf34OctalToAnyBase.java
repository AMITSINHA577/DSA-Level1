package javaLevel1;

public class jf34OctalToAnyBase {

	public static void main(String[] args) {

//		int octal = 123;
//		int orgOctal = octal;
//		int base = 8;
//		int ans = 0;
//		int pov = 0;
//		while (octal != 0) {
//
//			int singlNum = octal % 10;
//			octal /= 10;
//
//			int temp = 1;
//			for (int i = 0; i <= pov; i++) {
//				if (i > 0) {
//					temp *= base;
//				}
//			}
//
//			ans += temp * singlNum;
//			pov++;
//		}
//		System.out.println("Octal " + orgOctal + " to Decimal Conversion is: " + ans);

		int num = 1172; // base 10
		int base = 8; // convert to base 8
		int orgOctal = num;

		int rev = 0;
		int p = 1;
		while (num != 0) {
			int dig = num % 10;
			num /= 10;

			rev += dig * p;
			p = p * base;
		}
		System.out.println("Octal " + orgOctal + " to Decimal Conversion is: " +rev);

	}

}
