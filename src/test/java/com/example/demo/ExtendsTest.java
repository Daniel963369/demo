package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.Animal;
import com.example.demo.entity.Bird;
import com.example.demo.entity.Car;
import com.example.demo.entity.Dog;

public class ExtendsTest {
	
//	@Test
//	public void extendText1(){
//		
//		Animal anim =new Animal();
//		System.out.println(anim.getName());
//		Bird bird = new Bird();
//		bird.eat();
//	}
	
	@Test
	public void interfaceTest(){
		
		Car car = new Car();
		car.run();
		Dog dog = new Dog();
		dog.eat();
		Bird bird = new Bird();
		bird.setName("«¢«¢");
		System.out.println(bird.getName());
		bird.eat();
		bird.fly();
		
	}
	
	
}
