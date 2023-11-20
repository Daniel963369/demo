package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;


@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {

	//限制搜尋結果回傳筆數
	public List<Meal> findTop2ByName(String name);
	public List<Meal> findFirst2ByName(String name);
	
	//orderBy:排序 預設 ASC
	//ASC:由小到大 DESC:由大到小
	public List<Meal> findByNameOrderByPrice(String name);
	
	public List<Meal> findByNameOrderByPriceDesc(String name);
	
	
	//比較大小:
	//1.大於:GreaterThan 2.大於GreaterThanEqual
	//3.小於:LessThan 4.小於等於LessThanEqual
	
	public List<Meal> findByPriceGreaterThan(int price);
	
	public List<Meal> findByNameAndPriceGreaterThan(String name,int price);
	
	//containing
	public List<Meal> findByNameContaining(String name);
	public List<Meal> findByNameContainingAndCookingStyleContaining(String name,String cookingStyle);
	
	//between :有包含上下限的值
	public List<Meal>findByPriceBetweenOrderByPrice(int price1,int price2);
	
	//in
	
	public List<Meal> findByPriceIn(List<Integer> priceList);
	
	//not in
	public List<Meal> findByPriceNotIn(List<Integer> priceList);
	

}
