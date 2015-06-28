package omc_design_patterns.design_patterns.structural.decorator;

public class SpikeEvolution implements Alien {
	private Alien alien;
	private int spikeAttackPower;
	public SpikeEvolution(Alien alien, int spikeAttackPower){
		this.alien = alien;
		this.spikeAttackPower = spikeAttackPower;
	}
	@Override
	public void attack(SpaceMarine spaceMarine) {
		System.out.println("Alien shot spikes at the marine for: "+spikeAttackPower+" damage");
		spaceMarine.handleDamage(spikeAttackPower);
		
	}

	@Override
	public void defend() {
		alien.defend();
		
	}

	@Override
	public void run() {
		alien.defend();
	}
	@Override
	public void handleDamage(int damage) {
		alien.handleDamage(damage);
		
	}

}
