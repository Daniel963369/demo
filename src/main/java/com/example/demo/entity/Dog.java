package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;






public class Dog extends Animal implements RunService {

	
		private String name;
		private String color;
		private int age;
		
		
		
		public Dog(String name, String color, int age) {
			super();
			this.name = name;
			this.color = color;
			this.age = age;
		}
		public Dog() {
			super();
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
			this.color = color;
			this.age = age;
		}
		
		@Override
		public void run() {
			System.out.println("ª¯¨à¦b©b¶]");
		}
}
