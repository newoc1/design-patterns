package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;

public class Meteor implements MinorSpell{
	private Set<DamageType> damageTypes;
	public Meteor(){
		damageTypes = new HashSet<>();
		damageTypes.add(DamageType.FIRE);
		damageTypes.add(DamageType.EARTH);
	}
	@Override
	public Set<DamageType> getDamageTypes() {
		return damageTypes;
	}

	@Override
	public int getDamage() {
		return 25;
	}

	@Override
	public int getHealthLeech() {
		return 10;
	}
}
