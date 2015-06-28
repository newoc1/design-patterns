package omc_design_patterns.design_patterns.structural.decorator;

public class NoxiousGasEvolution implements Alien {
	private Alien alien;
	private int gasCloudDamage;
	private boolean gasDeployed;

	public NoxiousGasEvolution(Alien alien, int gasCloudDamage) {
		this.alien = alien;
		this.gasDeployed = false;
	}

	@Override
	public void attack(SpaceMarine spaceMarine) {
		alien.attack(spaceMarine);
	}

	@Override
	public void defend() {
		alien.defend();
		gasCloud();
	}

	@Override
	public void run() {
		gasCloud();
		alien.run();
	}

	
	private void gasCloud(){
		System.out.println("Alien left an impassable cloud of gas.");
		//If this were an actual game, instantiate a gas cloud at position x, y, z
		setGasDeployed(true);
	}

	public Alien getAlien() {
		return alien;
	}

	public void setAlien(Alien alien) {
		this.alien = alien;
	}

	public int getGasCloudDamage() {
		return gasCloudDamage;
	}

	public void setGasCloudDamage(int gasCloudDamage) {
		this.gasCloudDamage = gasCloudDamage;
	}

	public boolean isGasDeployed() {
		return gasDeployed;
	}

	public void setGasDeployed(boolean gasDeployed) {
		this.gasDeployed = gasDeployed;
	}

	@Override
	public void handleDamage(int damage) {
		alien.handleDamage(damage);
		
	}

}
