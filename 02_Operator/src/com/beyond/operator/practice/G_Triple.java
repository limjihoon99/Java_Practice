package com.beyond.operator.practice;

import java.util.Scanner;

public class G_Triple {
	
	public void method1() {
		
		int number = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		number = scanner.nextInt();
		
		// result = (number > 0) ? "양수이다." : "음수이다.";
		result = (number > 0) ? "양수이다." : (number == 0) ? "0입니다." : "음수이다.";
		
		System.out.printf("%d은(는) %s", number, result);
	}
	
	/*
	 * 실습 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서
	 * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다." 
	 * 아닌 경우 "결과가 100 보다 작습니다." 출력
	 */
	public void practice1() {
		
		int number1 = 0;
		int number2 = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		number1 = scanner.nextInt();
		System.out.print("정수값 입력 > ");
		number2 = scanner.nextInt();
		
		result = (number1 * number2 > 100) ? "결과가 100 이상입니다." : "결과가 100 보다 작습니다.";
		
		System.out.printf("%s\n", result);
	}
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다." 
	 * 아닌 경우 "알파벳 대문자가 아니다." 출력
	 */
	public void practice2() {
		
		char alphabet = '\u0000';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요. > ");
		alphabet = scanner.nextLine().charAt(0);
		
		result = (('A' <= alphabet) && (alphabet <= 'Z')) ? "알파벳 대문자이다." : "알파벳 대문자가 아니다.";
		System.out.printf("%s\n", result);
	}
	
	/*
	 * 실습 문제 3
	 * 
	 * 두 정수를 입력받고 + 또는 - 를 입력받아서 계산을 출력하라
	 * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
	 * 
	 * 예시)
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+ 또는 -) > +
	 *   
	 *   3 + 4 = 7
	 */
	public void practice3() {
		
		int number1 = 0;
		int number2 = 0;
		char operation = '\u0000';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 > ");
		number1 = scanner.nextInt();
		System.out.print("두 번쨰 수 > ");
		number2 = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("연산자 입력(+ 또는 -) > ");
		operation = scanner.nextLine().charAt(operation);
		
		result = (operation == '+') ? String.format("%d %c %d = %d", number1, operation, number2, (number1 + number2))
                : (operation == '-') ? String.format("%d %c %d = %d", number1, operation, number2, (number1 - number2)) 
                        : "잘못 입력했습니다.";
		
		System.out.println(result);
		scanner.close();
	}

}
