package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.attributes.DamageOverTime;

public class DeadMajorSpell implements MajorSpell{
	private Set<DamageType> damageTypes;
	public DeadMajorSpell(){
		damageTypes = new HashSet<>();
		damageTypes.add(DamageType.PHYSICAL);
	}
	@Override
	public Set<DamageType> getDamageTypes() {
		return damageTypes;
	}

	@Override
	public int getDamage() {
		return 5;
	}

	@Override
	public DamageOverTime getDamageOverTime() {
		return new DamageOverTime(1, 1);
	}
	
	@Override
	public void hit(Enemy enemy) {
		enemy.hitByMajorSpell(this);
		
	}

}
