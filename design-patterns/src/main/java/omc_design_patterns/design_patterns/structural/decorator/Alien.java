package omc_design_patterns.design_patterns.structural.decorator;

public interface Alien {

	void attack(SpaceMarine spaceMarine);
	
	void defend();
	
	void run();
	
	void handleDamage(int damage);
}
