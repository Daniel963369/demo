package com.example.demo.entity;

public class Animal {
	private String name = "�j�·�";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name +"���b�Y�F��");
	}
	
	public void sleep() {
		System.out.println( this.name +"���b��ı");
	}
}
