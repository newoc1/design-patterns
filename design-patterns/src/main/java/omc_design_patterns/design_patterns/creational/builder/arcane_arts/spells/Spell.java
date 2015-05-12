package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells;

import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;

public interface Spell {

	Set<DamageType> getDamageTypes();
	
	int getDamage();
	
	void hit(Enemy enemy);
	
}
