package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	
	@Id
	@Column(name="menu_name")
	private String menu_name;
	
	@Column(name="menu_price")
	private int menu_price;
	
	public Menu() {
		super();
	}
	
	public Menu(String menu_name, int menu_price) {
		super();
		this.menu_name = menu_name;
		this.menu_price = menu_price;
	}
	
	public String getMenu_name() {
		return menu_name;
	}
	
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	
	public int getMenu_price() {
		return menu_price;
	}
	
	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}
}
