package omc_design_patterns.design_patterns.creational.abstr.factory.minor;

import omc_design_patterns.design_patterns.creational.abstr.factory.BlueGem;
import omc_design_patterns.design_patterns.creational.abstr.factory.GemCreator;
import omc_design_patterns.design_patterns.creational.abstr.factory.RedGem;

public class Aquamarine implements BlueGem {

	@Override
	public String getName() {
		return "Aquamarine";
	}

	@Override
	public int getHardness() {
		return 6;
	}

	@Override
	public int getManaRestoration() {
		return 10;
	}



}
