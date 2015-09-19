package omc_design_patterns.design_patterns.behavioral.template;

import ch.qos.logback.core.net.SyslogOutputStream;

public class MasterPizzaArtisan extends PizzaArtisan {

	@Override
	public void acquireIngredients() {
		System.out
				.println("Master pizza artisan acquires the freshest ingredients.");

	}

	@Override
	public void makeDough() {
		System.out
				.println("Master pizza artisan mixes the flour, yeast, water, salt, and sugar to make a masterful dough base. He then kneads and gracefully twirls the subservient dough to his will, imbuing it with the love only a master artisan can accomplsih.");

	}

	@Override
	public void topBase() {
		System.out.println("The Master Pizza Artisan scoops a ladleful of a pureed tomato sauce, fragrant with fresh garlic and basil. The slowly covers the entirety of the circular dough base with the savory nectar.");
		System.out.println("He then cracks fresh pepper and crushes rock salt over the base, the begins adding fresh mozzarella and capicola");
	}

	@Override
	public void bakePizza() {
		System.out.println("The Master Pizza Artisan places the pizza in the wood-fired brick oven and lets the hickory smoke dissolve into the essence of the pizza. A beautiful pizza is born.");

	}

}
