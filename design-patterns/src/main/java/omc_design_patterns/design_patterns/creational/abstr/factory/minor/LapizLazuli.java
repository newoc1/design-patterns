package omc_design_patterns.design_patterns.creational.abstr.factory.minor;

import omc_design_patterns.design_patterns.creational.abstr.factory.BlueGem;

public class LapizLazuli implements BlueGem {

	@Override
	public String getName() {
		return "LapizLazuli";
	}

	@Override
	public int getHardness() {
		return 4;
	}

	@Override
	public int getManaRestoration() {
		return 5;
	}

}
