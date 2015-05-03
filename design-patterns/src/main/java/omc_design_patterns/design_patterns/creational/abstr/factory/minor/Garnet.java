package omc_design_patterns.design_patterns.creational.abstr.factory.minor;

import omc_design_patterns.design_patterns.creational.abstr.factory.RedGem;

public class Garnet implements RedGem {

	@Override
	public String getName() {
		return "Garnet";
	}

	@Override
	public int getHardness() {
		return 2;
	}

	@Override
	public int getHealthRestoration() {
		return 10;
	}

}
