package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	
	public void method1() {
		
		int number1 = 10;
		int number2 = 25;
		boolean result = false;
		
		//result = number1 == number2;
		//result = number1 != number2;
		//result = number1 > number2;
		//result = number1 < number2;
		result = 'A' == 65;
		
		System.out.println("result: " + result);
		
	}
	public void method2() {
		
		int number = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();
		
		result = ((number % 2) == 0);
		
		System.out.printf("%d은(는) 짝수인가요? %b\n", number, result);
		
		scanner.close();
	}

}
