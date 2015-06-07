package omc_design_patterns.design_patterns.structural.adapter;

import omc_design_patterns.design_patterns.structural.adapter.pastries.Pastry;
import omc_design_patterns.design_patterns.structural.adapter.pastrysuppliers.BigMart;

public class HungryMan implements HungryPerson {
	private BigMart bigMart;
	private int health;

	public HungryMan(BigMart bigMart, int health) {
		this.bigMart = bigMart;
		this.health = health;
	}

	@Override
	public void eatSomething() {
		Pastry pastry = bigMart.supplyPastry();
		health += pastry.eatPastry();
	}

	public BigMart getBigMart() {
		return bigMart;
	}

	public void setBigMart(BigMart bigMart) {
		this.bigMart = bigMart;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
