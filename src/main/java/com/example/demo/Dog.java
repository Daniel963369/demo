package com.example.demo;


public class Dog {
	
	private String name = "Apple";
	private String color;
	private int age;
	
	public Dog() {
		super();
	}
	
	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAttribute(String name, String color, int age) {
		this.name = name;
		this.color  = color;
		this.age = age;
	}
		
	
	public void setAttributes1() {
		System.out.println("================================");
	}
	
	public static void setAttribute2() {
		System.out.println("================================");
	}
}

