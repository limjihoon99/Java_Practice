package com.beyond.operator.practice;

public class B_InDecrease {
	
	public void method1() {
		int number = 10;
		
		System.out.println("전위 연산 적용 전 number의 값: " + number);
		System.out.println("1회 수행 값: " + ++number);
		System.out.println("2회 수행 값: " + ++number);
		System.out.println("3회 수행 값: " + ++number);
		System.out.println("전위 연산 적용 후 number의 값: " + number);
		
		System.out.println("전위 연산 적용 전 number의 값: " + number);
		System.out.println("1회 수행 값: " + number--);
		System.out.println("2회 수행 값: " + number--);
		System.out.println("3회 수행 값: " + number--);
		System.out.println("전위 연산 적용 후 number의 값: " + number);
	}
	
	public void method2() {
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		
		System.out.println(number1++); // 11
		System.out.println((++number1) + (number2++)); // 
		System.out.println((number1++) + (--number2) + (--number3));
		System.out.println();
		
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		System.out.println("nubmer3: " + number3);
	}

}
