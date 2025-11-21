package com.sp1.app;

public class FactorialNumber {

	public static void main(String[] args) {
		
		System.out.println("FactorialNumber.main()");
		
		 int num =5;
		 int sum=1;
		 while(num>0) {
			 sum = sum*num;
			 System.out.println(sum);
			 num--;
		 }
		 
		 System.out.println(" Factorial is :: "+sum);
		 
		 System.out.println(factorial(5));
	}

	private static int factorial(int i) {
		
		if(i==1 ||  i==0) {
			return 1;
		}
			
		
		return i * factorial(i-1);
	}
}
