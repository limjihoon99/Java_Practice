package com.beyond.stream.practice;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {
	private String name;
	
	private int age;
	
	private String gender;
	
	private int math;
	
	private int english;

	@Override
	public int compareTo(Student student) {
		
		return this.age - student.age;
	}	
	
	
	
	
	
	
	
	
}