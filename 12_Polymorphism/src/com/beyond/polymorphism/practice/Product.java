package com.beyond.polymorphism.practice;

public class Product {
	protected String brand; // 브랜드
	
	protected String code; // 상품 코드
	
	protected String name; // 상품 이름
	
	protected int price; // 가격
	
	public Product() {
	}

	public Product(String brand, String code, String name, int price) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}
}