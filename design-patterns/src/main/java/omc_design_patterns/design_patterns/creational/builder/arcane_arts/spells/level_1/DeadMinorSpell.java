package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;

public class DeadMinorSpell implements MinorSpell{
	private Set<DamageType> damageTypes;
	public DeadMinorSpell(){
		damageTypes = new HashSet<>();
		damageTypes.add(DamageType.PHYSICAL);
	}
	@Override
	public Set<DamageType> getDamageTypes() {
		return damageTypes;
	}

	@Override
	public int getDamage() {
		return 1;
	}
	@Override
	public int getHealthLeech() {
		// TODO Auto-generated method stub
		return 0;
	}

}
