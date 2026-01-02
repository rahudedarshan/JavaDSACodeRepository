package com.sp1.app;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("PalindromeString.main()");

		String str = "radars";
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPalindrome = false;
				break;
			}

			if (isPalindrome) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrome");
			}
		}
	}
}
