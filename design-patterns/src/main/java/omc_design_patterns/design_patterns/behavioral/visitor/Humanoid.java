package omc_design_patterns.design_patterns.behavioral.visitor;

public interface Humanoid {

	void target(Humanoid humanoid);
	void attack();
	void takeDamage(int attackPower);
	void alterAttackPower(int numberToLowerBy);
	void usePower(PowerGiver powerGiver);
	void getStatus();
}
