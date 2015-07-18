package omc_design_patterns.design_patterns.structural.facade.employee.cook;

import java.util.ArrayList;
import java.util.List;

import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Bacon;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Meatballs;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Beef;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Pork;
import omc_design_patterns.design_patterns.structural.facade.ingredients.sauce.Marinara;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Basil;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Tomato;

public class SousChef {
	private List<Meatballs> meatballs;
	private List<Marinara> marinara;
	private List<Bacon> bacon;

	public SousChef() {
		meatballs = new ArrayList<>();
		marinara = new ArrayList<>();
		bacon = new ArrayList<>();
	}

	public void cookMeatballs(Beef beef) {
		meatballs.add(new Meatballs(beef));
	}

	public void makeMarinara(Tomato tomato, Basil basil) {
		marinara.add(new Marinara(tomato, basil));
	}

	public void makeBacon(Pork pork) {
		bacon.add(new Bacon(pork));
	}

	public List<Meatballs> getMeatballs() {
		return meatballs;
	}

	public List<Marinara> getMarinara() {
		return marinara;
	}

	public List<Bacon> getBacon() {
		return bacon;
	}
}
