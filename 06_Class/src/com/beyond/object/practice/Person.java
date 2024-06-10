package com.beyond.object.practice;

public class Person {
	
	private String name;
	
	private int age;
	
	// 동일한 패키지에 존재하는 Person 클래스에서 Phone 클래스를 아무런 제약없이 사용할 수 있다.
	private Phone phone = new Phone();
	
	public Person() {
		System.out.println("생성자 호출");
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = (age >= 0) ? age : 0;
	}
	
	public void setPhone(String brand, String name, String color) {
		phone.setBrand(brand);
		phone.setName(name);
		phone.setColor(color);
	}
	
	public void whoAreYou() {
		System.out.printf("안녕하세요. 저는 %s입니다. 나이는 %d세입니다.\n", name, age);
		System.out.printf("저는 %s의 %s(%s)을(를) 가지고 있습니다.\n", phone.getBrand(), phone.getName(), phone.getColor());
	}

}
