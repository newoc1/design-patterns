package omc_design_patterns.design_patterns.structural.adapter.pastries;

public class ChocolateCake implements Cake {
	private int healthRestore;
	private boolean eaten;

	public ChocolateCake(int healthRestore) {
		this.healthRestore = healthRestore;
		eaten = false;
	}

	@Override
	public boolean eatCake() {
		boolean successfulCakeConsumption = false;
		if (eaten == false) {
			eaten = true;
			System.out.println("Cake has been eaten");
			successfulCakeConsumption = true;
		}
		return successfulCakeConsumption;
	}

	public int getHealthRestore() {
		return healthRestore;
	}

	public void setHealthRestore(int healthRestore) {
		this.healthRestore = healthRestore;
	}

}
