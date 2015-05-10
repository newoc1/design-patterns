package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells;

import java.util.Set;

public interface Spell {

	Set<DamageType> getDamageTypes();
	
	int getDamage();
}
