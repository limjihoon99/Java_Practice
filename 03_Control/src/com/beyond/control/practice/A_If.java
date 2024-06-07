package com.beyond.control.practice;

import java.util.Scanner;

public class A_If {
	
	public void method1() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력 > ");
		number = scanner.nextInt();
		
		if ((number % 2) == 0) {
			System.out.printf("%d은(는) 짝수이다.\n", number);
		} else {
			System.out.printf("%d은(는) 홀수이다.\n", number);
		}
	}
	
	public void method2() {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요. > ");
		name = scanner.nextLine();
		
//		System.out.println("홍길동" == "홍길동");
//		System.out.println("홍길동" == new String("홍길동"));
//		System.out.println("홍길동" == name);
//		System.out.println();
//		System.out.println("홍길동".equals("홍길동"));
//		System.out.println("홍길동".equals(new String("홍길동")));
//		System.out.println("홍길동".equals(name));
		
		if (name != null && name.equals("홍길동")) {
			System.out.printf("%s은(는) 홍길동 본인이다.", name);
		} else {
			System.out.printf("%s은(는) 홍길동 본인이 아니다.", name);
		}
	}
	
	public void practice() {
		int score = 0;
		char grade = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요. > ");
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
	}

}
