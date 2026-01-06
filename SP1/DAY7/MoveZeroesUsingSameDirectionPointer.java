package com.sp1.app;

import java.util.Arrays;

public class MoveZeroesUsingSameDirectionPointer {

	public static void main(String[] args) {
	  
		int []arr = { 1, 0, 0, 2, 3, 3, 4 };
		
		moveZeroesToEnd(arr);
	}

	private static void moveZeroesToEnd(int[] arr) {
		
		int slow=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				arr[slow] = arr[i];
				slow++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		while(slow<arr.length) {
			arr[slow]=0;
			slow++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}
