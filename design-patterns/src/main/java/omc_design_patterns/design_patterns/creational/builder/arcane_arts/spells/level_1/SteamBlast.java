package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;

public class SteamBlast implements MinorSpell {

	private Set<DamageType> damageTypes;
	public SteamBlast(){
		damageTypes = new HashSet<>();
		damageTypes.add(DamageType.FIRE);
		damageTypes.add(DamageType.WATER);
	}
	@Override
	public Set<DamageType> getDamageTypes() {
		return damageTypes;
	}

	@Override
	public int getDamage() {
		return 45;
	}

	@Override
	public int getHealthLeech() {
		return 5;
	}
}
