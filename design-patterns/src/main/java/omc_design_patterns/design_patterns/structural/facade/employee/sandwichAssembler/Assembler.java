package omc_design_patterns.design_patterns.structural.facade.employee.sandwichAssembler;

import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.BaconCheddarJalapeno;
import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.WholeWheat;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.PepperJack;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.Provolone;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Bacon;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Meatballs;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Turkey;
import omc_design_patterns.design_patterns.structural.facade.ingredients.sauce.Marinara;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Lettuce;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Olive;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Tomato;
import omc_design_patterns.design_patterns.structural.facade.sandwich.MeatballSub;
import omc_design_patterns.design_patterns.structural.facade.sandwich.TurkeyClub;
import omc_design_patterns.design_patterns.structural.facade.sandwich.VeggieSandwich;

public class Assembler {

	public MeatballSub makeMeatballSub(Meatballs meatball, Marinara marinara,BaconCheddarJalapeno bread, Provolone provolone){
		
		return new MeatballSub(meatball,marinara, bread, provolone);
	}
	
	public VeggieSandwich makeVeggieSandwich(Tomato tomato, Olive olive, Lettuce lettuce, PepperJack pepperjack, WholeWheat bread){
		return new VeggieSandwich(tomato, olive, lettuce, pepperjack, bread);
	}
	
	public TurkeyClub makeTurkeyClub(Tomato tomato, WholeWheat bread,Lettuce lettuce, Turkey turkey, Bacon bacon, Provolone provolone){
		return new TurkeyClub(tomato, bread, lettuce, turkey, bacon, provolone);
	}
}
