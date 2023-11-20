package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.Dog;

public class ClassTest {

//	@Test
//	public void classTest6(){
//		Dog dog  = new Dog();
//		dog.setName("Lily");
//		dog.setColor("blue");
//		dog.setAge(3);
//		
//		Dog doggi = new Dog("dokkidokki","brown",2);
//	}
//	
	@Test
	public void classTest7(){
		Dog dog  = new Dog();
		dog.setAttribute("Lily", "brown", 2);
		String information = dog.getName()+"\n"+dog.getColor()+"\n"	+dog.getAge();
		System.out.println(information);
//		dog.setAttributes1();
//		Dog.setAttribute2();//static的方法呼叫 可以直接用類別+方法
//		
	}
}
