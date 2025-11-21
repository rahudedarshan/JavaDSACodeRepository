package com.sp1.app;

public class LowestCommonMultiple {

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
	 public static int lcmCal(int a, int b) {

	        int max = Math.max(a, b);

	        // Keep checking multiples of the larger number
	        while (true) {
	            if (max % a == 0 && max % b == 0) {
	                return max;   // Found the LCM
	            }
	            max++;
	        }
	    }

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 18;

		int result = lcm(num1, num2);
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
		
		int res = lcmCal(num1, num2);
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + res);
		
	}
}
