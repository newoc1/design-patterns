package omc_design_patterns.design_patterns.behavioral.strategy;

public interface WeaponStrategy {
	void reload();
	void fire(int timesToFire);
}
