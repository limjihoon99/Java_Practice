package com.beyond.operator.practice;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		
		int number = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를입력해 주세요. > ");
		number = scanner.nextInt();
		
		result = (number >= 1) && (number <= 100);
		
		System.out.printf("%d는 1부터 100 사이의 값인가요? %b\n", number, result);
		
	}
	
	public void method2() {
		
		int number = 10;
		boolean result = false;
		
		System.out.println("&& 연산 전의 number의 값: " + number);
		
		// && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (number < 5) && (++number > 0);
		// result = (number < 5) & (++number > 0);
		
		System.out.println("&& 연산 후의 number의 값: " + number);
		System.out.println();
		
		System.out.println("|| 연산 전의 number의 값: " + number);
		
		result = (number < 20) || (++number > 0);
		
		System.out.println("result: " + result);
		System.out.println("|| 연산 후의 number의 값:" + number);
		
	}
	
	public void practice() {
		
		/*
		 * 실습 문제
		 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
		 * 
		 * 예시)
		 * 문자 하나 입력 > f
		 * 사용자가 입력한 값이 대문자입니까?: false
		 */
		
		char alphabet = '\u0000';
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요. > ");
		alphabet = scanner.nextLine().charAt(0);
		
		result = (alphabet >= 'A') && (alphabet <= 'Z');
		
		System.out.println("사용자가 입력한 값이 대문자입니까? " + result);
		
	}

}
