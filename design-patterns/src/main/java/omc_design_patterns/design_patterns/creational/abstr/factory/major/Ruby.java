package omc_design_patterns.design_patterns.creational.abstr.factory.major;

import omc_design_patterns.design_patterns.creational.abstr.factory.RedGem;

public class Ruby implements RedGem {
	private String name;
	private int hardness;
	private int healthRestoration;
	public Ruby(String name, int hardness, int healthRestoration){
		this.name = name;
		this.hardness = hardness;
		this.healthRestoration = healthRestoration;
	}
	public Ruby(){
		name = "Ruby";
		hardness = 7;
		healthRestoration = 50;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getHardness() {
		return hardness;
	}

	@Override
	public int getHealthRestoration() {
		return healthRestoration;
	}

}
