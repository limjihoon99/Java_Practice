package com.beyond.operator.practice;

public class C_Arithmetic {
	
	public void method1() {
		System.out.println("실행 테스트");
		
		int number1 = 10;
		int number2 = 20;
		
		System.out.printf("%d + %d = %d\n", number1, number2, (number1 + number2));
		System.out.printf("%d - %d = %d\n", number1, number2, (number1 - number2));
		System.out.printf("%d * %d = %d\n", number1, number2, (number1 * number2));
		System.out.printf("%d / %d = %d\n", number1, number2, (number1 / number2));
		System.out.printf("%d %% %d = %d\n", number1, number2, (number1 % number2));
		System.out.println();
		
		System.out.println((char)('홍' + 1));
		System.out.println('a' + 'b');
		System.out.println();
		
		double dNumber1 = 35.0;
		double dNumber2 = 10.0;
		
		System.out.printf("%.1f + %.1f = %.1f\n", dNumber1, dNumber2, (dNumber1 + dNumber2));
		System.out.printf("%.1f - %.1f = %.1f\n", dNumber1, dNumber2, (dNumber1 - dNumber2));
		System.out.printf("%.1f * %.1f = %.1f\n", dNumber1, dNumber2, (dNumber1 * dNumber2));
		System.out.printf("%.1f / %.1f = %.1f\n", dNumber1, dNumber2, (dNumber1 / dNumber2));
		System.out.printf("%.1f %% %.1f = %.1f\n", dNumber1, dNumber2, (dNumber1 % dNumber2));
		
		System.out.println(5 / 0.0);
		System.out.println(5 % 0.0);
		System.out.println((5 / 0.0) + 2);
		System.out.println((5 % 0.0) + 2);
	}

}
