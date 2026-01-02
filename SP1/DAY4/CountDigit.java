package com.sp1.app;

public class CountDigit {

	public static void main(String[] args) {
		
		int num = -153;
		int count =0;
		int n = Math.abs(num);
		
	//	System.out.println(n+" : "+num);
		
		 if (n == 0) count = 1; 
		 
	        while (n != 0) {
	            n /= 10;
	            count++;
	        }
	        
	      int cnt = String.valueOf(Math.abs(num)).length();
	      
	      System.out.println("Count Of Digit is "+count + " : "+cnt);
	}
}
