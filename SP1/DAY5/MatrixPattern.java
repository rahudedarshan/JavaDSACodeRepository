package com.sp1.app;

public class MatrixPattern {

	public static void main(String[] args) {
		
		int num =3;
		generatingMatrixPattern(num);
	}

	private static void generatingMatrixPattern(int num) {
		
		int cnt =1;
		for(int i=1;i<=3;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(cnt);
				cnt++;
			}
			System.out.println();
		}
		
	}
}
