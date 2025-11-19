package com.sp1.app;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("PrimeNumber.main()");
		
		int num = 11;
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(i);i++) {
			if(num%i==0) {
				flag = false;
                break;
			}
		}
		
		if(flag) {
			System.out.println("Given Number is prime");
		}else {
			System.out.println("Given Number is Not prime");
		}
		
	}
}
