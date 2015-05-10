package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2;

import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.Spell;
import omc_design_patterns.design_patterns.creational.builder.attributes.DamageOverTime;

public interface MajorSpell extends Spell {
	
	DamageOverTime getDamageOverTime();
}
