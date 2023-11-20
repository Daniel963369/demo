package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.Repository.MenuDao;
import com.example.demo.entity.Menu;
import com.example.demo.service.ifs.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	
	@Override
	public Menu addMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getMenu_name()) || menu.getMenu_price() <= 0) {
			return null;
		}
		
		if(menuDao.existsById(menu.getMenu_name())){
			return null;
		}
		return menuDao.save(menu);
	}
	@Override
	public List<Menu> addMenus(List<Menu> menus) {
		
		for(Menu item:menus) {
			if(!StringUtils.hasText(item.getMenu_name()) || item.getMenu_price() <= 0) {
				return null;
			}
		}
		return menuDao.saveAll(menus);
	}
	@Override
	public Menu updateMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getMenu_name()) || menu.getMenu_price() <= 0) {
			return null;
		}
		return menuDao.save(menu);
	}
	@Override
	public Menu findbyName(String name) {
		Optional<Menu> menuOp = menuDao.findById(name);
		if(menuOp.isEmpty()) {
			return null;	
		}
		return menuOp.get();	
	}
	@Override
	public List<Menu> findAll() {
		return menuDao.findAll();
	}

}
