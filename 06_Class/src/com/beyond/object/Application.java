package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {

	public static void main(String[] args) {
		Person hong = new Person();
		
		hong.setName("홍길동");
		hong.setAge(23);
		hong.setPhone("애플", "아이폰12 미니", "화이트");
		hong.whoAreYou();
	}

}
