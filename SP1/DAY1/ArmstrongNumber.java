package com.sp1.app;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("ArmstrongNumber.main()");

		int num  =153;
		int original = num;
		int rem = 0;
		int ans = 0;

		int cnt = String.valueOf(Math.abs(num)).length();
		while (num > 0) {
			rem = num % 10;
			ans = (int) (ans + (Math.pow(rem, cnt)));
			num = num / 10;

		}

		if (original == ans) {
			System.out.println("Armstrong Number!");
		} else {
			System.out.println("Not an Armstrong Number!");
		}

	}
}
