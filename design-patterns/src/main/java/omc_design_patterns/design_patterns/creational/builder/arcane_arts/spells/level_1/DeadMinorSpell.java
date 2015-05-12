package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.attributes.LifeLeech;

public class DeadMinorSpell extends MinorSpell{
	private Set<DamageType> damageTypes;
	public DeadMinorSpell(Wizard wizard){
		super(wizard);
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
	
	@Override
	public void hit(Enemy enemy) {
		LifeLeech lifeLeech = enemy.hitByMinorSpell(this);
		wizard.gainHealth(lifeLeech.getLifeLeech());
		
	}

}
