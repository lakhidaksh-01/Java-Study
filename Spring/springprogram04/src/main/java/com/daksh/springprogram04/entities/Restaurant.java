package com.daksh.springprogram04.entities;
import org.springframework.beans.factory.annotation.Autowired;
public class Restaurant {
	private String name;
	@Autowired
	private Chef chef;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void print() {
		System.out.print("Name: "+name+" Chef: ");
		chef.display();
	}
}
