package com.beyond.dynamic;

import com.beyond.dynamic.practice.DynamicExample;

public class Application {

	public static void main(String[] args) {
//		long n = 10L;
		long n = 75L;
		
		System.out.printf("피보나치수열의 %d번째 항의 값은 %d입니다.\n", n, DynamicExample.fibonacci(n));
		System.out.printf("피보나치수열의 %d번째 항의 값은 %d입니다.\n", n, DynamicExample.fibonacci(n));
		System.out.println();
	}
}