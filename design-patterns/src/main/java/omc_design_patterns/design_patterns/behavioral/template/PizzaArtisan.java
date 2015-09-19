package omc_design_patterns.design_patterns.behavioral.template;


public abstract class PizzaArtisan {

	public void makeThePizza(){
		acquireIngredients();
		makeDough();
		topBase();
		bakePizza();
	}
	
	public abstract void acquireIngredients();
	
	public abstract void makeDough();
	
	public abstract void topBase();
	
	public abstract void bakePizza();
}
