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
//			System.out.println("Bird���b�Y");
//		}
//		
//		public void sleep() {
//			System.out.println("Bird���b��ı");
//		}
		
		public void fly() {
			System.out.println(super.getName()+"���b��");
		}
}
