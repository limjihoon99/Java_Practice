package com.beyond.operator.practice;

public class F_Assignment {
	
	public void method1() {
		
		int number = 12;
		String str = "Hello ";
		
		number += 3;
		System.out.println("number += 3 은(는) " + number);
		
		number -= 5;
		System.out.println("number -= 5 은(는) " + number);
		
		number *= 6;
		System.out.println("number *= 6 은(는) " + number);
		
		number /= 3;
		System.out.println("number /= 3 은(는) " + number);
		
		number %= 3;
		System.out.println("number %= 3 은(는) " + number);
		
		str += "World!";
		System.out.println("str += \"World!\" 은(는) " +str);
	}

}
