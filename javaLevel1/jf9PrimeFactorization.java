package javaLevel1;

public class jf9PrimeFactorization {

	public static void main(String[] args) {

		int num = 1440;
		
		for(int i=2;i*i<=num;i++) {
		
			while(num%i==0) {
				num/=i;
				System.out.print(i+" ");
				
			}
		}
		if(num!=1) {
			System.out.print(num+" ");
		}
		
	}

}
