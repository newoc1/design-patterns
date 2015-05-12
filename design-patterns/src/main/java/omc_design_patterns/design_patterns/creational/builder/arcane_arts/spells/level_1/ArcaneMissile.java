package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.attributes.LifeLeech;

public class ArcaneMissile extends MinorSpell{
	private Set<DamageType> damageTypes;
	
	public ArcaneMissile(Wizard wizard){
		super(wizard);
		damageTypes = new HashSet<>();
		damageTypes.add(DamageType.FIRE);
		damageTypes.add(DamageType.AIR);
		
	}
	@Override
	public Set<DamageType> getDamageTypes() {
		return damageTypes;
	}

	@Override
	public int getDamage() {
		return 15;
	}

	@Override
	public int getHealthLeech() {
		return 30;
	}
	@Override
	public void hit(Enemy enemy) {
		LifeLeech lifeLeech = enemy.hitByMinorSpell(this);
		wizard.gainHealth(lifeLeech.getLifeLeech());
	}

}
