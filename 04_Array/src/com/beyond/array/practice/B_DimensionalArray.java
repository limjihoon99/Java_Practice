package com.beyond.array.practice;

public class B_DimensionalArray {
	
	public void method1() {
		int[][] iArray;
		
		iArray = new int[3][5];
		
		int value = 1;
		
//		System.out.println(iArray.length);
//		System.out.println(iArray[0].length);
//		System.out.println(iArray[1].length);
//		System.out.println(iArray[2].length);
		
		// 2차원 배열에 초기
		for(int i = 0; i < iArray.length; i++) {
			for(int j = 0; j < iArray[i].length; j++) {
				iArray[i][j] = value++;
			}
		}
		
		// 2차원 배열의 값을 출력
		for(int i = 0; i < iArray.length; i++)  {
			for(int j = 0; j < iArray[i].length; j++) {
				System.out.printf("%2d", iArray[i][j]);
			}
			System.out.println();
		}
	}
	
 	public void method2() {
 		String[][] sArray = {
 				{"Linux", "MariaDB"},
 				{"Java", "Spring"},
 				{"HTML5", "CSS3", "Vue.js"}
 		};
 		
 		for(int i = 0; i < sArray.length; i++) {
 			for(int j = 0; j < sArray[i].length; j++) {
 				System.out.printf("%s\t", sArray[i][j]);
 			}
 			System.out.println();
 		}
 	}
}
