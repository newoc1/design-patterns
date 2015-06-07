package omc_design_patterns.design_patterns.structural.adapter.pastries;

public class Croissant implements Pastry {
	private int healthRestore;
	public Croissant(int healthRestore){
		this.healthRestore = healthRestore;
	}
	@Override
	public int eatPastry() {
		System.out.println("croissant has been eaten.");
		return healthRestore;
	}

}
