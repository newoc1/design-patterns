package omc_design_patterns.design_patterns.behavioral.template;

public class CafeteriaWorker extends PizzaArtisan {

	@Override
	public void acquireIngredients() {
		System.out
				.println("The cafeteria worker begrudgingly walks over to the freezer and extracts a sizeable packet name: \"Pizza Kit\"");

	}

	@Override
	public void makeDough() {
		System.out
				.println("The cafeteria worker pulls out the rock-hard dough base and places it on a plate.");

	}

	@Override
	public void topBase() {
		System.out
				.println("The cafeteria worker puts the sauce and other toppings in the microwave for 45 seconds. "
						+ "He squeezes the sauce packet onto the dough base and then sprinkles the rest of the toppings on "
						+ "as well as dumps a packet of shredded cheese onto the dough base.");
	}

	@Override
	public void bakePizza() {
		System.out.println("The cafeteria worker places the pizza in the TurboCooker 9000 and waits 4 minutes before heaping the pizza onto a plastic plate and serving it up.");
	}

}
