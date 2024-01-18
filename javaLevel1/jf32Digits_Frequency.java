package javaLevel1;

public class jf32Digits_Frequency {

	public static int digitsFre(int num, int digit) {
		int count = 0;
		while (digit != 0) {
			int temp = digit % 10;
			if (temp == num) {
				count++;
			}
			digit /= 10;
		}
		return count;
	}

	public static void main(String[] args) {

		int digit = 987698798;
		int num = 9;

		System.out.println(digitsFre(num, digit));

	}

}
