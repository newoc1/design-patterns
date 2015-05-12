package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.attributes.LifeLeech;

public class SteamBlast extends MinorSpell {

	private Set<DamageType> damageTypes;
	public SteamBlast(Wizard wizard){
		super(wizard);
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
	
	@Override
	public void hit(Enemy enemy) {
		LifeLeech lifeLeech = enemy.hitByMinorSpell(this);
		wizard.gainHealth(lifeLeech.getLifeLeech());
	}
}
