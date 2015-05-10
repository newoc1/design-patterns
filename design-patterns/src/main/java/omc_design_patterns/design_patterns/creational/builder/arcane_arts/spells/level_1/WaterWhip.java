package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;

public class WaterWhip implements MinorSpell{
	private Set<DamageType> damageTypes;
	public WaterWhip(){
		damageTypes = new HashSet<>();
		damageTypes.add(DamageType.WATER);
		damageTypes.add(DamageType.AIR);
	}
	@Override
	public Set<DamageType> getDamageTypes() {
	return damageTypes;
	}

	@Override
	public int getDamage() {
		return 70;
	}

	@Override
	public int getHealthLeech() {
		return 20;
	}
}
