package com.daksh.springprogram04.entities;

public class Chef {
	private String name;
	private int experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void display() {
		System.out.print("name is "+name+"and experience of yrs "+experience);
	}
}
