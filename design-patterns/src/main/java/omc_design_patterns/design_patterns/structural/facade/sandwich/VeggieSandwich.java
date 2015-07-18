package omc_design_patterns.design_patterns.structural.facade.sandwich;

import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.WholeWheat;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.PepperJack;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Lettuce;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Olive;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Tomato;

public class VeggieSandwich implements Sandwich {

	public VeggieSandwich(Tomato tomato, Olive olive, Lettuce lettuce,
			PepperJack pepperJack, WholeWheat bread) {
		System.out.println("Veggie Sandwich created!");
	}

	@Override
	public String getName() {
		return "Veggie Sandwich";
	}

}
