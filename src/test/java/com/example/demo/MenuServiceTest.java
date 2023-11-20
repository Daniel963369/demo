package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Menu;
import com.example.demo.service.ifs.MenuService;

@SpringBootTest
public class MenuServiceTest {

	@Autowired
	private MenuService menuService;
	
	@Test
	public void addMenuTest() {
		menuService.addMenu(new Menu("pork",100));
		menuService.addMenu(new Menu("pork",120));
	}
	
	@Test
	public void updateMenuTest() {
		menuService.updateMenu(new Menu("pork",150));

	}
}
