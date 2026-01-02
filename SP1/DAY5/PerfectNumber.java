package com.sp1.app;

public class PerfectNumber {

	public static void main(String[] args) {
		
		System.out.println("PerfectNumber.main()");
		
		perfectNumber(28);
	}

	private static void perfectNumber(int i) {
		int sum =0,input=i; 
		for(int j=1;j<i;j++) {
			if(i%j==0) {
				sum = sum +j;
			}
		}
		
		if(sum ==input) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect Number");
		}
	}
}
