package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.Repository.MealDao;
import com.example.demo.entity.Meal;
import com.example.demo.service.ifs.MealService;

@SpringBootTest
public class MealTest {

	@Autowired
	private MealDao mealDao;
	
	@Autowired 
		private MealService mealService;
	
	@Test
	public void addMealTest() {
		//name不符合條件
	    Meal result = mealService.addMeal(new Meal("","BBQ",180));
		Assert.isTrue(result == null,"addMeal error!!");
		
		result = mealService.addMeal(new Meal("beef","",180));
		Assert.isTrue(result == null,"addMeal error!!");
		
		result = mealService.addMeal(new Meal("beef","BBQ",0));
		Assert.isTrue(result == null,"addMeal error!!");
		
		result = mealService.addMeal(new Meal("beef","BBQ",180));
		Assert.isTrue(result !=null,"addMeal error!!");
	}
	
	@Test
	public void addMeal() {
		mealService.addMeal(new Meal("beef","BBQ",180));
		mealService.addMeal(new Meal("beef","fry",150));
		mealService.addMeal(new Meal("pork","fried",220));
		mealService.addMeal(new Meal("chicken","stew",260));
		mealService.addMeal(new Meal("chicken","BBQ",260));
		mealService.addMeal(new Meal("chicken","steam",520));
	
		
	}
	
	@Test
	public void limitTest() {
		List<Meal> res =mealDao.findFirst2ByName("chicken");
		Assert.isTrue(res.size()==2,"find limit error!!!");
	}
	
	@Test
	public void orderByTest() {
		List<Meal> res = mealDao.findByNameOrderByPriceDesc("chicken");
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
	}
	
	@Test
	public void compareTest() {
		List<Meal> res = mealDao.findByPriceGreaterThan(200);
		
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
	}
	
	@Test
	public void containingTest() {
		List<Meal> res = mealDao.findByNameContainingAndCookingStyleContaining("e","b");
		
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
		}
	
	@Test
	public void betweenTest() {
		List<Meal> res = mealDao.findByPriceBetweenOrderByPrice(200,300);
		
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
		}
	
	@Test
	public void inTest() {
		List<Meal> res = mealDao.findByPriceIn(new ArrayList<>(List.of(120,150,180)));
		
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCookingStyle()+item.getPrice());
		}
		}
	}
	

