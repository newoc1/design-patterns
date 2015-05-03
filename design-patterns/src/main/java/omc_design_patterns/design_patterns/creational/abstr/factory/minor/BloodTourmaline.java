package omc_design_patterns.design_patterns.creational.abstr.factory.minor;

import omc_design_patterns.design_patterns.creational.abstr.factory.RedGem;

public class BloodTourmaline implements RedGem {

	@Override
	public String getName() {
		return "BloodTourmaline";
	}

	@Override
	public int getHardness() {
		return 3;
	}

	@Override
	public int getHealthRestoration() {
		return 8;
	}

}
