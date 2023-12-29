package javaLevel1;

public class jf6DigitsOfNumber {

	public static void main(String[] args) {
		int num = 65784383;
//		int temp = 0;
//		while(num!=0) {
//			temp = temp *10 +(num%10);
//			num/=10;
//		}
//		System.out.println(temp);
//		while(temp!=0) {
//			System.out.println(temp%10);
//			temp/=10;
//		}
		
		
		String stringToNumber = Integer.toString(num);
		for(int i=0;i<stringToNumber.length();i++) {
			System.out.println(stringToNumber.charAt(i));
		}
	}

}
