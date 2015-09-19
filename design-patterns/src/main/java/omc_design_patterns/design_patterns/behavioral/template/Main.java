package omc_design_patterns.design_patterns.behavioral.template;

public class Main {

	public static void main(String[] args){
		PizzaArtisan cafeteriaWorker = new CafeteriaWorker();
		PizzaArtisan master = new MasterPizzaArtisan();
		cafeteriaWorker.makeThePizza();
		master.makeThePizza();
	}
}
