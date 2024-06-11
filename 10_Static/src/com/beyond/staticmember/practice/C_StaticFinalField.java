package com.beyond.staticmember.practice;

public class C_StaticFinalField {
	// final 필드를 초기화하는 방법
	// 1) 선언 시 명시적으로 지정하는 방법
//	private final String gender = "남자";
	
	// 2) 생성자를 통해서 지정하는 방법
	private final String gender;
	
	// 상수(static final) 선언
	public static final int MAX_LEVEL = 30;	

	public C_StaticFinalField(String gender) {
		this.gender = gender;
	}

//	final 필드에 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없다.
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
	
	public String getGender() {
		return this.gender;
	}
}