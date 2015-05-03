package omc_design_patterns.design_patterns.creational.abstr.factory.major;

import omc_design_patterns.design_patterns.creational.abstr.factory.RedGem;

public class ImperialTopaz implements RedGem {

	@Override
	public String getName() {
		return "ImperialTopaz";
	}

	@Override
	public int getHardness() {
		return 9;
	}

	@Override
	public int getHealthRestoration() {
		return 30;
	}

}
