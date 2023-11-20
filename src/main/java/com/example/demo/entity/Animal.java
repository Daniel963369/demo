package com.example.demo.entity;

public class Animal {
	private String name = "大麻煩";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name +"正在吃東西");
	}
	
	public void sleep() {
		System.out.println( this.name +"正在睡覺");
	}
}
