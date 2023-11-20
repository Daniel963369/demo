package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;


@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {

	//����j�M���G�^�ǵ���
	public List<Meal> findTop2ByName(String name);
	public List<Meal> findFirst2ByName(String name);
	
	//orderBy:�Ƨ� �w�] ASC
	//ASC:�Ѥp��j DESC:�Ѥj��p
	public List<Meal> findByNameOrderByPrice(String name);
	
	public List<Meal> findByNameOrderByPriceDesc(String name);
	
	
	//����j�p:
	//1.�j��:GreaterThan 2.�j��GreaterThanEqual
	//3.�p��:LessThan 4.�p�󵥩�LessThanEqual
	
	public List<Meal> findByPriceGreaterThan(int price);
	
	public List<Meal> findByNameAndPriceGreaterThan(String name,int price);
	
	//containing
	public List<Meal> findByNameContaining(String name);
	public List<Meal> findByNameContainingAndCookingStyleContaining(String name,String cookingStyle);
	
	//between :���]�t�W�U������
	public List<Meal>findByPriceBetweenOrderByPrice(int price1,int price2);
	
	//in
	
	public List<Meal> findByPriceIn(List<Integer> priceList);
	
	//not in
	public List<Meal> findByPriceNotIn(List<Integer> priceList);
	

}
