package omc_design_patterns.design_patterns.structural.facade.sandwich;

import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.BaconCheddarJalapeno;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.Provolone;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Meatballs;
import omc_design_patterns.design_patterns.structural.facade.ingredients.sauce.Marinara;

public class MeatballSub implements Sandwich{

	public MeatballSub(Meatballs meatballs,Marinara marinara, BaconCheddarJalapeno bread, Provolone provolone){
		System.out.println("MeatballSub created!");
	}

	@Override
	public String getName() {
		return "Meatball Sub";
	}
}
