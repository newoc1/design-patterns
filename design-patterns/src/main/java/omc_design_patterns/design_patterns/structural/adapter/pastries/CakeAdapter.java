package omc_design_patterns.design_patterns.structural.adapter.pastries;

public class CakeAdapter implements Pastry{
	private Cake cake;
	public CakeAdapter(Cake cake){
		this.cake = cake;
	}
	@Override
	public int eatPastry() {
		int healthRestored = 0;
		if(cake.eatCake()){
			healthRestored = cake.getHealthRestore();
		}
		return healthRestored;
	}

}
