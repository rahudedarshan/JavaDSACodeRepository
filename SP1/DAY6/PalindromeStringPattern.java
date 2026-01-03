package com.sp1.app;

public class PalindromeStringPattern {

	public static void main(String[] args) {
		
		String str =  "abba";
		
		checkPalindrome(str);
	}

	private static void checkPalindrome(String str) {
		
		int left =0, right = str.length()-1;
		
		boolean isPalindrome =false;
		while(left<right) {
			
			if(str.charAt(left)==str.charAt(right)) {
				isPalindrome = true;
			}
			
			left++;
			right--;
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome String!");
		}else {
			System.out.println("Not Palindrome String!");
		}
		
	}
}
