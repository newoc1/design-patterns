package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.Spell;

public abstract class MinorSpell implements Spell {
	protected Wizard wizard;
	public MinorSpell(Wizard wizard){
		this.wizard = wizard;
	}
	abstract int getHealthLeech();

	@Override
	public Set<DamageType> getDamageTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void hit(Enemy enemy) {
		// TODO Auto-generated method stub
		
	}
	
}
