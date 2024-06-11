package com.beyond.field.practice;

public class User {
	
	public String id = "hong";
	
	private String password = "1234";
	
	public String name = "홍길동";
	
	public void test(int number) {
		int num = 20;
		
		// 지역변수는 반드시 사용하기 전에 초기화해야 한다.
		System.out.println(num);
		
		// 매개변수는 메소드 호출 시 반드시 값이 전달되어 오기 때문에 출력이 가능하다.
		System.out.println(number);
		
		// 필드는 클래스 전역에서 사용이 가능하다.
		// 미 초기화시 JVM이 기본값으로 초기화한다.
		System.out.println(password);
		
		password = "1234";
		
		System.out.println(password);
	}

}
