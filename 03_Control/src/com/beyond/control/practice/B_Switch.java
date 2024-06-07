package com.beyond.control.practice;

import java.util.Scanner;

public class B_Switch {
	/*
	 * switch
	 *   [표현법]
	 *   	switch(값) { // 정수, 문자, 문자열
	 *   		case 값1:
	 *   			실행 코드..
	 *   			break;
	 *   		case 값2:
	 *   			실행 코드..
	 *   			break;
	 *   		...
	 *   		[default:
	 *   			실행 코드..
	 *   		]
	 *   	}
	 */
	
	// 사용자로부터 과일 이름을 입력받고 입력한 과일의 가격을 출력한다.
	// 단, 지정한 과일이 없으면 "판매하지 않는 과일입니다."를 출력한다.
	public void method1() {
		int price = 0;
		String fruit = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과일 이름 > ");
		fruit = scanner.nextLine();
		
		switch(fruit) {
			case "포도":
				price = 8000;
				
				break;
			case "딸기":
				price = 10000;
				
				break;
			case  "사과":
				price = 3000;
				
				break;
			default:
				System.out.println("판매하지 않는 과일입니다.");
				
				// return 아래 코드는 실행하지 않고 실행 흐름을
				// 메소드를 호출한 쪽으로 돌려준다.
				return;
		}
		
		System.out.printf("%s의 가격은 %d원 입니다.", fruit, price);
	}
	
	/*
	 * 1 ~ 12월까지 입력받아서 해당하는 달의 마지막 날짜를 출력한다.
	 * 
	 * 31일까지 존재하는 월 : 1, 3, 5, 7, 8, 10, 12
	 * 30일까지 존재하는 월 : 4, 6, 9, 11
	 * 28일 또는 29일까지 존재하는 월 : 2
	 */
	public void method2() {
		int month = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월까지 중 하나를 입력하세요. > ");
		month = scanner.nextInt();
		
		if (!(month >= 1 && month <= 12)) {
			System.out.println("1 ~ 12월까지 입력하셔야 합니다.");
			
			return;
		}
		
//		switch(month) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				System.out.printf("%d월은 31일까지 입니다.", month);
//				
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				System.out.printf("%d월은 30일까지 입니다.", month);
//				
//				break;
//			case 2:
//				System.out.printf("%d월은 28일 혹은 29일까지 입니다.", month);
//				
//				break;
//		}
		
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.printf("%d월은 31일까지 입니다.", month);
				
				break;
			case 4, 6, 9, 11:
				System.out.printf("%d월은 30일까지 입니다.", month);
				
				break;
			case 2:
				System.out.printf("%d월은 28일 혹은 29일까지 입니다.", month);
				
				break;
		}
	}
	
	/*
	 * 실습 문제 
	 * 
	 * 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력받아서 계산을 출력하라
	 * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력
	 * 
	 * 예시)
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+, -, *, /) > +
	 *   
	 *   3 + 4 = 7
	 *   
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+, -, *, /) > a
	 *   
	 *   연산자를 잘못 입력하셨습니다.
	 */
	public void practice() {
		
		int number1 = 0;
		int number2 = 0;
		char operation = '\u0000';
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 > ");
		number1 = scanner.nextInt();
		System.out.print("두 번쨰 수 > ");
		number2 = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("연산자 입력(+, -, *, /) > ");
        operation = scanner.nextLine().charAt(0);
        
        System.out.println();
        
        switch(operation) {
        	case '+':
        		result = number1 + number2;
        		break;
        	case '-':
        		result = number1 + number2;
        		break;
        	case '*':
        		result = number1 + number2;
        		break;
        	case '/':
        		result = number1 + number2;
        		break;
        	default:
        		System.out.println("연산자를 잘못 입력했습니다.");
        		return;
        }
        System.out.printf("%d %c %d = %d", number1, operation, number2, result);
		
//		switch(operation) {
//			case '+':
//				System.out.printf("%d %c %d = %d\n", number1, operation, number2, number1 + number2);
//			
//				break;
//			case '-':
//				System.out.printf("%d %c %d = %d\n", number1, operation, number2, number1 - number2);
//			
//				break;
//			case '*':
//				System.out.printf("%d %c %d = %d\n", number1, operation, number2, number1 * number2);
//			
//				break;
//			case '/':
//				System.out.printf("%d %c %d = %d\n", number1, operation, number2, number1 / number2);
//			
//				break;
//			default:
//				System.out.println("연산자를 잘못 입력했습니다.");
//				return;
//		}
		
	}
}



