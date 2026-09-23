package com.daksh.springprogram03.entities;

public class Restaurant {
	private Cheif cheif;
	public Restaurant(Cheif cheif) {
		this.cheif=cheif;
	}
	public void print() {
		cheif.cook();
	}
}
