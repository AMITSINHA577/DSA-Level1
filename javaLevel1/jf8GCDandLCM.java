package javaLevel1;

public class jf8GCDandLCM {

	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 9;
		
		int smallNum = 0;
		
		int GCD = 1;
		if(num1>num2) {
			smallNum = num2;
		}else {
			smallNum = num1;
		}
		
		for(int i=1;i<smallNum;i++) {
			if(num1%i==0 && num2%i==0) {
				GCD = i;
			}
		}
		
		System.out.println("GCD of "+num1+" and "+num2+" is: "+GCD);
		
		System.out.println("LCM of "+num1+" and "+num2+ " is: "+ (num1*num2)/GCD);
		

	}

}
