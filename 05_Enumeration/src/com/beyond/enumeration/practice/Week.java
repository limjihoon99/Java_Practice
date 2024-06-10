package com.beyond.enumeration.practice;

public enum Week {
	MONDAY("Monday", "Mon"),
	TUESDAY("Tuesday", "Tue"),
	WEDNESDAY("Wednesday", "Wed") ,
	THURSDAY("Thursday", "Thu"),
	FRIDAY("Friday", "FRI"),
	SATURDAY("Sayurday", "Sat"),
	SUNDAY("Sunday", "Sun");
	
	private final String name;
	private final String shortName;
	
	private Week(String name, String shortName) {
		this.name = name;
		this.shortName = shortName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getShortName() {
		return this.shortName;
	}
}
