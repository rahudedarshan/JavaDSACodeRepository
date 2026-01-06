package com.sp1.app;

import java.util.Arrays;

public class seperateEvenOddNums {

	
	
	public static void main(String[] args) {
		
		 int []arr = {1,2,3,4,5,6};
		 
		int [] num =  segregateEvenAndOdd(arr);
		
		System.out.println(Arrays.toString(num));
	}

	private static int[] segregateEvenAndOdd(int[] arr) {
		
		int slow =0;
		
		for(int fast=0;fast<arr.length;fast++) {
			
			if(arr[fast]%2==0) {
				int temp = arr[slow];
				arr[slow]=arr[fast];
				arr[fast] = temp;
				slow++;
			}
		}
		return arr;
	}
}
