package omc_design_patterns.design_patterns.structural.facade.sandwich;

import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.WholeWheat;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.Provolone;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Bacon;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Turkey;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Lettuce;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Tomato;

public class TurkeyClub implements Sandwich {

	public TurkeyClub(Tomato tomato, WholeWheat wholeWheatBread, Lettuce lettuce, Turkey turkey, Bacon bacon,Provolone provolone){
		System.out.println("TurkeyClub created!");
	}

	@Override
	public String getName() {
		return "Turkey Club";
	}
}
