package omc_design_patterns.design_patterns.creational.builder.actors.enemies;

import omc_design_patterns.design_patterns.creational.builder.actors.Actor;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.MinorSpell;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.MajorSpell;
import omc_design_patterns.design_patterns.creational.builder.attributes.LifeLeech;
import omc_design_patterns.design_patterns.creational.builder.weapons.Weapon;

public interface Enemy extends Actor {
	
	void hitWizardWithWeapon(Wizard wizard);
	
	LifeLeech hitByMinorSpell(MinorSpell minorSpell);
	
	void hitByMajorSpell(MajorSpell majorSpell);
	void takeDamageOverTime();
}
