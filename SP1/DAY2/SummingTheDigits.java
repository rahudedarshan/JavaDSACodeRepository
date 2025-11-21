package com.sp1.app;

public class SummingTheDigits {

	public static void main(String[] args) {
		System.out.println("SummingTheDigits.main()");
		
		int num =1234;
		String str = String.valueOf(num);
		int sum =0;
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			sum = sum + ch - '0';
		}
		
		System.out.println(sum);
	}
}
