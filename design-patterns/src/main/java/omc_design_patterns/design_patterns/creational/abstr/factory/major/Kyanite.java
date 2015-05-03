package omc_design_patterns.design_patterns.creational.abstr.factory.major;

import omc_design_patterns.design_patterns.creational.abstr.factory.BlueGem;

public class Kyanite implements BlueGem {

	@Override
	public String getName() {
		return "Kyanite";
	}

	@Override
	public int getHardness() {
		return 4;
	}

	@Override
	public int getManaRestoration() {
		return 55;
	}

}
