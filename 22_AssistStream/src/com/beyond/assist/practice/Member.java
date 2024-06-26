package com.beyond.assist.practice;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Member implements Serializable {
	private static final long serialVersionUID = -4795058672379803983L;

	@Getter
	private String id;
	
	private transient String password;
	
	private String name;
	
	private int age;
	
	private char gender;
	
	private double point;
}