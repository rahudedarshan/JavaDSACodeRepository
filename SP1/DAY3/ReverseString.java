package com.sp1.app;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("ReverseString.main()");
		
		String str = "programming";
		
		StringBuilder builder = new StringBuilder(str).reverse();
		
		System.out.println("Reversed String :: "+ builder.toString());
		
		  String reversed = reverseStringUsingRecurssion(str);
		
		  System.out.println("Reversed String :: "+ reversed);
			
	}

	private static String reverseStringUsingRecurssion(String str) {
		
		if(str==null || str.length()<=1) {
			return str;
		}
		
			return reverseStringUsingRecurssion(str.substring(1)+str.charAt(0));
		
	}
}
