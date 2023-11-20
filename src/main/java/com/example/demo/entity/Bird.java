package com.example.demo.entity;

public class Bird extends Animal {
		private String name;

//		public String getName() {
//			return name;
//		}

//		public void setName(String name) {
	//			this.name = name;
	//		}
		
//		public void eat() {
//			System.out.println("Bird正在吃");
//		}
//		
//		public void sleep() {
//			System.out.println("Bird正在睡覺");
//		}
		
		public void fly() {
			System.out.println(super.getName()+"正在飛");
		}
}
