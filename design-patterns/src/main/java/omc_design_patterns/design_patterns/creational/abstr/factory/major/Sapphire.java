package omc_design_patterns.design_patterns.creational.abstr.factory.major;

import omc_design_patterns.design_patterns.creational.abstr.factory.BlueGem;

public class Sapphire implements BlueGem {
	private String name;
	private int hardness;
	private int manaRestoration;
	public Sapphire(String name, int hardness, int manaRestoration){
		this.name = name;
		this.hardness = hardness;
		this.manaRestoration = manaRestoration;
	}
	public Sapphire(){
		name = "Sapphire";
		hardness = 7;
		manaRestoration = 25;
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
	public int getManaRestoration() {
		return manaRestoration;
	}

}
