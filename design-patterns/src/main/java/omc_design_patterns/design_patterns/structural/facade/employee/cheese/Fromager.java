package omc_design_patterns.design_patterns.structural.facade.employee.cheese;

import java.util.ArrayList;
import java.util.List;

import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.PepperJack;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.Provolone;

/**
 * Cheese maker
 *
 */
public class Fromager {
	private List<PepperJack> pepperJackStock;
	private List<Provolone> provoloneStock;
	
	public Fromager(){
		pepperJackStock = new ArrayList<>();
		provoloneStock = new ArrayList<>();
	}
	public void makePepperJack(){
		pepperJackStock.add(new PepperJack());
	}
	
	public void makeProvolone(){
		provoloneStock.add(new Provolone());
	}
	public List<PepperJack> getPepperJackStock() {
		return pepperJackStock;
	}
	public List<Provolone> getProvoloneStock() {
		return provoloneStock;
	}
}