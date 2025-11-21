package com.sp1.app;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println("GreatestCommonDivisor.main()");
		
		int a = 48, b=18;
		
		while(b!=0) {
			int temp = b;
			b=a%b;
			a=temp;
		}
		
		System.out.println("Highest Common Divisor is : "+a);
		
		int gcd =1;
		 a = 48;b=18;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i == 0 && b%i==0) {
				gcd = i;
			}
		}
		System.out.println("Highest Common Divisor is : "+gcd);
	}
}
