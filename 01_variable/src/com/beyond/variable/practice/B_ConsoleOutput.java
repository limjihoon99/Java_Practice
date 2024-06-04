package com.beyond.variable.practice;

public class B_ConsoleOutput {
	public void valuePrint() {
		System.out.print("안녕하세요.");
		System.out.print(12345);
		System.out.print(false);
		System.out.println();
		
		// prin t메소드와 동일하게 출력하는 메소드
		// 출력 후 자동으로 줄바꾸믕ㄹ 해주는 메소드이다.
		System.out.println("안녕하세요.");
		System.out.println(1235);
		System.out.println(false);
		
		// 
		System.out.printf("%d\n", 10);
		System.out.printf("%d + %d = %d\n", 10, 20, (10 + 20));
		System.out.printf("%f\t%f\n", 3.14, 4.12345555);
		System.out.printf("%.2f\t%.3f\n", 3.14, 4.12345555);
		System.out.printf("%c %s\n", 'A', "'Hello'");
	}

}
