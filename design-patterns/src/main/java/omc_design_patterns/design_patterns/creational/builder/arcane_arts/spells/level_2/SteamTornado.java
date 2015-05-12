package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.attributes.DamageOverTime;

public class SteamTornado implements MajorSpell {
	public static int FIRE_VALUE = 2;
	public static int WATER_VALUE = 2;
	public static int AIR_VALUE = 0;
	public static int EARTH_VALUE = 0;
	private Set<DamageType> damageTypes;
	public SteamTornado(){
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
		return 50;
	}

	@Override
	public DamageOverTime getDamageOverTime() {
		return new DamageOverTime(6, 16);
	}
	
	@Override
	public void hit(Enemy enemy) {
		enemy.hitByMajorSpell(this);
		
	}

}
